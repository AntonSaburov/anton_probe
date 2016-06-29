package edu.javacourse.thread;

public class NotifyThread extends Thread
{
    private Monitor monitor;

    public NotifyThread(Monitor monitor) {
        this.monitor = monitor;
    }
    
    public void run() {
        monitor.wakeUp();
    }
}
