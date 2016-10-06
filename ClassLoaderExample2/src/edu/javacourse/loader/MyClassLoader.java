package edu.javacourse.loader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MyClassLoader extends ClassLoader
{
    public String url = "file:/home/S.Anton/work/1/";
    
    public MyClassLoader(ClassLoader parent) {
        super(parent);
    }

    @Override
    public Class loadClass(String name) throws ClassNotFoundException {
        if(!name.equals("edu.javacourse.loader.MyObject")) {
            return getParent().loadClass(name);
        }
        System.out.println("Use CUSTOM loader for class:" + name);
        try {
            String[] f = name.split("\\.");
            URL myUrl = new URL(url + f[f.length-1] + ".class");
            URLConnection connection = myUrl.openConnection();
            try (InputStream input = connection.getInputStream(); ByteArrayOutputStream buffer = new ByteArrayOutputStream()) {
                int data = input.read();
                while (data != -1) {
                    buffer.write(data);
                    data = input.read();
                }
                byte[] classData = buffer.toByteArray();

                return defineClass(name, classData, 0, classData.length);
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws
            ClassNotFoundException,
            IllegalAccessException,
            InstantiationException,
            NoSuchMethodException,
            IllegalArgumentException,
            InvocationTargetException,
            NoSuchFieldException {

        ClassLoader parentClassLoader = MyClassLoader.class.getClassLoader();
        {
            MyClassLoader classLoader = new MyClassLoader(parentClassLoader);
            System.out.println("FIRST loading");
            classLoader.url = "file:/home/S.Anton/work/1/";
            Class moc = classLoader.loadClass("edu.javacourse.loader.MyObject");

            Object ni = moc.newInstance();
            System.out.println(ni.getClass().getCanonicalName());
            Method m = moc.getMethod("hello", new Class[]{});
            m.invoke(ni, null);

            AnInterface2 object1 = (AnInterface2) moc.newInstance();
            object1.interfaceHello();
            System.out.println("1. AnInterface2 ClassLoader:" + object1.getClass().getClassLoader().getClass().getCanonicalName());
            MyObjectSuperClass object2 = (MyObjectSuperClass) moc.newInstance();
            object2.superHello();
            System.out.println("1. MyObjectSuperClass ClassLoader:" + object2.getClass().getClassLoader().getClass().getCanonicalName());
        }

        //create new class loader so classes can be reloaded.
        {
            MyClassLoader classLoader = new MyClassLoader(parentClassLoader);
            System.out.println("SECOND loading");
            classLoader.url = "file:/home/S.Anton/work/2/";
            Class moc = classLoader.loadClass("edu.javacourse.loader.MyObject");

            Object ni = moc.newInstance();
            System.out.println(ni.getClass().getCanonicalName());
            Method m = moc.getMethod("hello", new Class[]{});
            m.invoke(ni, null);
            
            AnInterface2 object1 = (AnInterface2) moc.newInstance();
            object1.interfaceHello();
            System.out.println("2. AnInterface2 ClassLoader:" + object1.getClass().getClassLoader().getClass().getCanonicalName());
            MyObjectSuperClass object2 = (MyObjectSuperClass) moc.newInstance();
            object2.superHello();
            System.out.println("2. MyObjectSuperClass ClassLoader:" + object2.getClass().getClassLoader().getClass().getCanonicalName());
        }
    }

}
