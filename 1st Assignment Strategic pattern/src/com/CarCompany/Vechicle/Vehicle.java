package com.CarCompany.Vechicle;

import com.CarCompany.DrivingStrategy.*;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private String color;
    private DrivingStrategy drivingStrategy;

    public Vehicle(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void setDrivingStrategy(DrivingStrategy drivingStrategy) {
        this.drivingStrategy = drivingStrategy;
    }

    public void startEngine() {
        System.out.println("Starting the engine of " + make + " " + model);
    }

    public void performAccelerate() {
        drivingStrategy.accelerate();
    }

    public void performBrake() {
        drivingStrategy.brake();
    }
}