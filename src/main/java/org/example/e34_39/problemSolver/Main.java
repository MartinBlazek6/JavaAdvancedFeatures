package org.example.e34_39.problemSolver;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Results results = new Results();
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 3; i++) {
            String sensorName = "Sensor-" + i;
            Sensor sensor = new Sensor(sensorName, results);
            executor.execute(sensor);
        }

        for (int i = 1; i <= 2; i++) {
            String screenName = "Screen-" + i;
            Screen screen = new Screen(screenName, results);
            executor.execute(screen);
        }

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executor.shutdownNow();
    }
}
