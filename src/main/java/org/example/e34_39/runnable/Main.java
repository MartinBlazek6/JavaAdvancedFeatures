package org.example.e34_39.runnable;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    private static final ExecutorService executor = Executors.newFixedThreadPool(2);
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



        for (int i = 1; i <= 10; i++) {
            String threadName = "Thread-" + i;
            Runnable runnable = new ThreadPlaygroundRunnable(threadName);
            executor.execute(runnable);
        }

        executor.shutdown();
    }


}
