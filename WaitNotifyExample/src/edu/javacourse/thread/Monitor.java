package edu.javacourse.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Monitor
{
    private boolean isWaken = false;
    
    public synchronized void goingWakeUp() {
        while(isWaken == false) {
            try {
                System.out.println("Wait " + Thread.currentThread().getName() + " is waiting");
                
                wait();  // check wiat(1000);
                
                System.out.println("Wait " + Thread.currentThread().getName() + " is waken up");
            } catch (InterruptedException ex) {
                ex.printStackTrace(System.out);
            }
        }
        System.out.println("Wait " + Thread.currentThread().getName() + " is finished");
    }
    
    public synchronized void wakeUp() {
        while(isWaken == false) {
            System.out.println("Notify " + Thread.currentThread().getName() + " is going to notify");
            
            notify(); //notifyAll();  
            isWaken = true;
            
            System.out.println("Notify " + Thread.currentThread().getName() + " notified");
        }
        System.out.println("Notify " + Thread.currentThread().getName() + " is finished");
    }
}
