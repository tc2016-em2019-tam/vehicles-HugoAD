package com.hugoaguirre;

public class PoliceCar extends Vehicle implements IEmergency,LandVehicle {
    private int numWheels;

    public PoliceCar(String name, int maxPassenger, double maxSpeed, int numWheels) {
        super(name, maxPassenger, maxSpeed);
        this.numWheels = numWheels;
    }

    public PoliceCar(String name, int numWheels) {
        super(name);
        this.numWheels = numWheels;
    }

    @Override
    public void soundSiren() {
        System.out.println("Calling soundSiren() method");
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

    public void patrol(){
        System.out.println("Police Car patrolling");
    }


}
