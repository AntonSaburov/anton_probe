package javacompile;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class JavaCompile {

    public static void main(String[] args) throws Exception {

        String source = "package edu.javacourse.compile; "
                + "import javacompile.SayHello;"
                + "public class Test implements SayHello { "
                + "public String sayHello(String xml) { return \"Hello Compiler:\" + xml; } "
                + "}";

        File root = new File(".");
        File sourceFile = new File(root, "edu/javacourse/compile/Test.java");
        sourceFile.getParentFile().mkdirs();
        Files.write(Paths.get(sourceFile.toURI()), source.getBytes());

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        compiler.run(null, null, null, sourceFile.getPath());

        URLClassLoader classLoader = URLClassLoader.newInstance(new URL[]{root.toURI().toURL()});
        Class<?> cls = Class.forName("edu.javacourse.compile.Test", true, classLoader);
        SayHello test = (SayHello)cls.newInstance();
        
        String xml = "<xml>Hello</xml>";
        System.out.println(test.sayHello(xml));
    }
}
