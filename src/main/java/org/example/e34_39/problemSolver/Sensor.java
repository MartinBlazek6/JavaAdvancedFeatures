package org.example.e34_39.problemSolver;

public class Sensor implements Runnable{
    private final String name;
    private final Results results;

    public Sensor(String name, Results results) {
        this.name = name;
        this.results = results;
    }

    @Override
    public void run() {
        while (true) {
            int currentResult = results.getCurrentResult();
            try {
                Thread.sleep((long) (Math.random() * 1000));
                int newResult = currentResult + (int) (Math.random() * 10);
                results.updateResult(newResult);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
