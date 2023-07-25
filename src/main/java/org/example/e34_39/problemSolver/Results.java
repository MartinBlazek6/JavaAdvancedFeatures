package org.example.e34_39.problemSolver;

public class Results {
    private int currentResult;

    public Results() {
        currentResult = 0;
    }

    public synchronized int getCurrentResult() {
        return currentResult;
    }

    public synchronized void updateResult(int newResult) {
        if (newResult > currentResult) {
            System.out.println("Updating result from " + currentResult + " to " + newResult);
            currentResult = newResult;
        } else {
            System.out.println("Rejected result update. Sensor data outdated.");
        }
    }
}
