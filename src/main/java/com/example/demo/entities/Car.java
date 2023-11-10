package com.example.demo.entities;

import com.example.demo.enums.VehicleType;

public class Car extends Vehicle {
    public Car(int engineCapacity, int manufactureYear) {
        super(engineCapacity, manufactureYear, VehicleType.CAR);
    }

    public int calculateTax(VehicleType vehicleType) {
        //Nurdöölöt
        return 18*this.getEngineCapacity()* this.calculateYearMultiplier();
    }
}