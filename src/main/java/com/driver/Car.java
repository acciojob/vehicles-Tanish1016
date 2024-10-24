package com.driver;



public class Car extends Vehicle {
    public int wheels;
    public String type;
    public int doors;
    public int gears;
    public boolean isManual;
    public int currentGear;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type) {
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.currentGear = 1;
    }

    public void changeGear(int newGear) {
        this.currentGear = newGear;
    }

    public void changeSpeed(int newSpeed, int newDirection) {
        this.move(newSpeed, newDirection);

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
}
