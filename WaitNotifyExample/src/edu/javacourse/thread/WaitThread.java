package edu.javacourse.thread;

public class WaitThread extends Thread
{
    private Monitor monitor;

    public WaitThread(Monitor monitor) {
        this.monitor = monitor;
    }
    
    public void run() {
        monitor.goingWakeUp();
    }
}
