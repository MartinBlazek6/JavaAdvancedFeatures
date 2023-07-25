package org.example.e34_39.cofeeMachine;

import lombok.SneakyThrows;

import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        WaterTank waterTank = new WaterTank();
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);

        // Schedule the creation and execution of coffee brewing services with a 3-second delay
        for (int i = 1; i <= 3; i++) {
            final int index = i; // Create a final variable to use inside the lambda expression
            scheduler.schedule(() -> {
                String serviceName = "Service-" + index;
                CoffeeBrewingService service = new CoffeeBrewingService(serviceName, waterTank);
                new Thread(service).start();
            }, i * 3, TimeUnit.SECONDS);
        }

        // Wait for the user to manually stop the program
        try {
            System.out.println("Press Enter to stop the program...");
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Shutdown the scheduler gracefully
        scheduler.shutdown();
    }
}
