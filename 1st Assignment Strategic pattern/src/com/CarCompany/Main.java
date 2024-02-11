package com.CarCompany;

import com.CarCompany.Vechicle.Vehicle;
import com.CarCompany.DrivingStrategy.*;
// import com.CarCompany.DrivingStrategy.*;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota", "Camry", 2022, "Red");
        NormalDrivingStrategy normalDriving = new NormalDrivingStrategy();
        AggressiveDrivingStrategy aggressiveDriving = new AggressiveDrivingStrategy();

        vehicle.setDrivingStrategy(normalDriving);
        vehicle.startEngine();
        vehicle.performAccelerate();
        vehicle.performBrake();

        vehicle.setDrivingStrategy(aggressiveDriving);
        vehicle.performAccelerate();
        vehicle.performBrake();
    }
}