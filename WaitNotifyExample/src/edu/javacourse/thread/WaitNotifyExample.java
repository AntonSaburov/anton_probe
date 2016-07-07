package edu.javacourse.thread;

public class WaitNotifyExample
{

    public static void main(String[] args) throws Exception {
        Monitor m = new Monitor();

        Thread w1 = new WaitThread(m);
        Thread w2 = new WaitThread(m);
        Thread w3 = new WaitThread(m);
        w1.start();
        w2.start();
        w3.start();

        Thread n1 = new NotifyThread(m);
        Thread.sleep(2000);
        n1.start();
    }
}
