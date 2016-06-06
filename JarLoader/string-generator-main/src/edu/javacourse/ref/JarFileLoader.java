package edu.javacourse.ref;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class JarFileLoader extends URLClassLoader {

    public JarFileLoader(URL[] urls) {
        super(urls);
    }

    public void addFile(String path) throws MalformedURLException {
        String urlPath = "jar:file://" + path + "!/";
//        String urlPath = path;
        addURL(new URL(urlPath));
    }

    public static void main(String args[]) throws Exception {
        URLClassLoader ucl = (URLClassLoader) ClassLoader.getSystemClassLoader();
        JarFileLoader cl = new JarFileLoader(ucl.getURLs());
        cl.addFile("/C:/tmp/string-generator-impl.jar");
        Class lc = cl.loadClass("edu.javacourse.ref.impl.StringGeneratorImpl");
        System.out.println("CLASS:" + lc.getCanonicalName());
        StringGenerator gen = (StringGenerator) lc.newInstance();
        System.out.println(gen.generate());
    }
}
