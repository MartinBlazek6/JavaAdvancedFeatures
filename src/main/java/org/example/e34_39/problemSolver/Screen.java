package org.example.e34_39.problemSolver;

public class Screen implements Runnable{
    private final String name;
    private final Results results;

    public Screen(String name, Results results) {
        this.name = name;
        this.results = results;
    }

    @Override
    public void run() {
        while (true) {
            int currentResult = results.getCurrentResult();
            System.out.println("Screen " + name + " is displaying current result: " + currentResult);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
