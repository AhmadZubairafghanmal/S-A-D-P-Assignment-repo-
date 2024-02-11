package com.CarCompany.DrivingStrategy;

public class AggressiveDrivingStrategy implements DrivingStrategy {
    @Override
    public void accelerate() {
        System.out.println("Accelerating with aggressive driving strategy");
    }

    @Override
    public void brake() {
        System.out.println("Braking with aggressive driving strategy");
    }
}