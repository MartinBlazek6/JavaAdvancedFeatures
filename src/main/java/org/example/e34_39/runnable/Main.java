package org.example.e34_39.runnable;

public class Main {

    private static Thread thread1;
    private static Thread thread2;
    public static void main(String[] args) {
        ThreadPlaygroundRunnable tpgr = new ThreadPlaygroundRunnable("Johny");

        tpgr.run();

        ThreadPlaygroundRunnable runnable1 = new ThreadPlaygroundRunnable("Thread 1");
        ThreadPlaygroundRunnable runnable2 = new ThreadPlaygroundRunnable("Thread 2");

        thread1 = new Thread(runnable1);
        thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
    }

}
