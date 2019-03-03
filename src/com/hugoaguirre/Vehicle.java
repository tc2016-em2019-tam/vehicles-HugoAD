package com.hugoaguirre;

public class Vehicle {
    private String name;
    private int maxPassenger;
    private double maxSpeed;

    public Vehicle(String name, int maxPassenger, double maxSpeed) {
        this.name = name;
        this.maxPassenger = maxPassenger;
        this.maxSpeed = maxSpeed;
    }

    public Vehicle(String name){
        this.name = name;
        this.maxPassenger = 0;
        this.maxSpeed = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
