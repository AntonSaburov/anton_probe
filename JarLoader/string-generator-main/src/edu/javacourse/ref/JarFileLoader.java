package edu.javacourse.ref;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class JarFileLoader extends URLClassLoader
{

    public JarFileLoader(URL[] urls) {
        super(urls);
    }

    public void addFile(String path) throws MalformedURLException {
        String urlPath = "jar:file://" + path + "!/";
        addURL(new URL(urlPath));
    }

    public static void main(String args[]) throws Exception {
        URLClassLoader ucl = (URLClassLoader) ClassLoader.getSystemClassLoader();
        JarFileLoader cl = new JarFileLoader(ucl.getURLs());
        cl.addFile("/home/S.Anton/person/anton_probe/JarLoader/string-generator-impl/dist/string-generator-impl.jar");
        
//        Class lc = cl.loadClass("edu.javacourse.ref.impl.StringGeneratorImpl");
        Class lc = Class.forName("edu.javacourse.ref.impl.StringGeneratorImpl", true, cl);
        System.out.println("CLASS:" + lc.getCanonicalName());
        StringGenerator gen = (StringGenerator) lc.newInstance();

        System.out.println(gen.generate());
        
        try {
            InputStream is = lc.getResourceAsStream("/rules/newfile.drl");
            InputStreamReader ras = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(ras);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
//        MyInvocationHandler handler = new MyInvocationHandler();
//        StringGenerator proxy = (StringGenerator) Proxy.newProxyInstance(
//                            StringGenerator.class.getClassLoader(),
//                            new Class[] { StringGenerator.class },
//                            handler);
//        String answer = proxy.generate();
//        System.out.println("ANSWER:" + answer);
    }
}

class MyInvocationHandler implements InvocationHandler
{
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Method:" + method.getName());
        return null;
    }
}
