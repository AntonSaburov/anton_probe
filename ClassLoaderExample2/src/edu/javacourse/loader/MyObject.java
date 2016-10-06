package edu.javacourse.loader;

public class MyObject extends MyObjectSuperClass implements AnInterface2
{
    private static final String TEST = "FIRST";

    static {
        System.out.println("LOADED 1:");
        System.out.println("ClassLoader for MyObject:" + MyObject.class.getClassLoader().getClass().getCanonicalName());
    }
    
    @Override
    public void superHello() {
        System.out.println("Super HELLO for " + TEST + " LOADING");
    }

    @Override
    public void interfaceHello() {
        System.out.println("Interface HELLO for " + TEST + " LOADING");
    }
    
    public void hello() {
        System.out.println("HELLO for " + TEST + " LOADING");
    }
}
