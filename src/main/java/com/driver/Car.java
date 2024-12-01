package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, int seats, boolean isManual, String type) {
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.currentGear = 1;
        this.seats =seats;
    }

    public void changeGear(int newGear) {
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + this.currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection) {
        this.move(newSpeed, newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

    public int getWheels() {
        return this.wheels;
    }

    public String getType() {
        return this.type;
    }

    public int getDoors() {
        return this.doors;
    }

    public int getGears() {
        return this.gears;
    }

    public boolean isManual() {
        return this.isManual;
    }

    public int getCurrentGear() {
        return this.currentGear;
    }

    public int getSeats() {
        return this.seats;
    }
}
