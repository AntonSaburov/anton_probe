package edu.javacourse.loader;

public abstract class MyObjectSuperClass {

    static {
        System.out.println("ClassLoader for MyObjectSuperClass:" + MyObjectSuperClass.class.getClassLoader().getClass().getCanonicalName());
    }
    
    public abstract void superHello();
}
