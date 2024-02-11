package com.CarCompany.DrivingStrategy;

public class NormalDrivingStrategy implements DrivingStrategy {
    @Override
    public void accelerate() {
        System.out.println("Accelerating with normal driving strategy");
    }

    @Override
    public void brake() {
        System.out.println("Braking with normal driving strategy");
    }
}