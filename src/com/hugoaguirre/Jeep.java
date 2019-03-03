package com.hugoaguirre;

public class Jeep extends Vehicle implements LandVehicle{
    private int numWheels;

    public Jeep(String name, int maxPassenger, double maxSpeed, int numWheels) {
        super(name, maxPassenger, maxSpeed);
        this.numWheels = numWheels;
    }

    public Jeep(String name, int numWheels) {
        super(name);
        this.numWheels = numWheels;
    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;

    }

    @Override
    public void drive() {
        System.out.println("Calling drive() method");

    }

    public void sounHorn(){
        System.out.println("Meep, meep");
    }
}
