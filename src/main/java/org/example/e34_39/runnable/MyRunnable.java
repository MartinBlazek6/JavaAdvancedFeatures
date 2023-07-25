package org.example.e34_39.runnable;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread name: " + threadName);
    }
}
