package org.example.e34_39.cofeeMachine;

public class CoffeeBrewingService implements Runnable{
    private final String name;
    private final WaterTank waterTank;
    private int brewCount;

    public CoffeeBrewingService(String name, WaterTank waterTank) {
        this.name = name;
        this.waterTank = waterTank;
        this.brewCount = 0;
    }

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (waterTank) {
                    while (waterTank.getWaterLevel() == 0) {
                        System.out.println(name + ": Water tank is empty. Waiting for refill.");
                        waterTank.wait();
                    }
                }

                // Simulate coffee brewing process
                System.out.println(name + ": Brewing coffee...");
                Thread.sleep(1000); // Simulate coffee brewing time

                synchronized (this) {
                    brewCount++;
                    if (brewCount >= 2) {
                        waterTank.brewCoffee();
                        brewCount = 0;
                    }
                }
            } catch (InterruptedException e) {
                System.out.println(name + ": Thread interrupted. Continuing...");
                // Restore the interrupted status
                Thread.currentThread().interrupt();
            }
        }
    }
}
