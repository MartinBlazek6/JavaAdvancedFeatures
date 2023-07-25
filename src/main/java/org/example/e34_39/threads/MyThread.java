package org.example.e34_39.threads;

public class MyThread extends Thread{

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread name: " + threadName);
    }
}
