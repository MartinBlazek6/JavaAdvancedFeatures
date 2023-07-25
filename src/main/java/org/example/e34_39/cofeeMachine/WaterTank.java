package org.example.e34_39.cofeeMachine;

import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;

public class WaterTank {
    private int waterLevel;
    private static final int MAX_WATER_LEVEL = 10;
    private boolean isEmpty;

    public WaterTank() {
        waterLevel = MAX_WATER_LEVEL;
        isEmpty = false;
    }

    public synchronized int getWaterLevel() {
        return waterLevel;
    }

    public synchronized void brewCoffee() {
        if (!isEmpty) {
            waterLevel--;
            if (waterLevel == 0) {
                isEmpty = true;
                System.out.println(Thread.currentThread().getName() +" water tank is empty. Refilling...");
                refill();
            }
        }
    }

    @SneakyThrows
    public synchronized void refill() {
        waterLevel = MAX_WATER_LEVEL;
        isEmpty = false;
        try {
            TimeUnit.SECONDS.sleep(5); // Simulate refill time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " has refilled the water tank. Current water level: " + waterLevel);
        notifyAll(); // Notify waiting threads that the tank is refilled
    }
}
