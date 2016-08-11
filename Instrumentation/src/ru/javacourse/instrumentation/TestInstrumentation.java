package ru.javacourse.instrumentation;

import java.lang.instrument.Instrumentation;

/**
 
 see http://docs.oracle.com/javase/7/docs/api/java/lang/instrument/package-summary.html
 
 
 * Create JAR file with class and MANIFEST.MF
 * MANIFEST.MF must contain:
 * 
 * Premain-Class: ru.javacourse.instrumentation.TestInstrumentation
 * 
 * After that you can run
 * 
 * java -javaagent:Instrumentation.jar -cp . Main
 * 
 * Class Main

public class Main
{
  public static void main(String[] args) {
    System.out.println("Hello !!!");
  }
}


If we want to get information during execution we can make so:


public class TestInstrumentation 
{
  private static volatile Instrumentation globalInstr;
  public static void premain(String args, Instrumentation inst) {
    globalInstr = inst;
  }
  public static long getObjectSize(Object obj) {
    if (globalInstr == null)
      throw new IllegalStateException("Agent not initted");
    return globalInstr.getObjectSize(obj);
  }
}

* 
*/

public class TestInstrumentation
{
    public static void premain(String args, Instrumentation inst) {
        Object obj = new Object();
        long size = inst.getObjectSize(obj);
        System.out.println("Bytes used by object: " + size);
    }
}
