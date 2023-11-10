package com.example.demo.entities;

import com.example.demo.enums.VehicleType;

public class Truck extends Vehicle {
    public Truck(int engineCapacity, int manufactureYear) {
        super(engineCapacity, manufactureYear, VehicleType.TRUCK);
    }

    public int calculateTax(VehicleType vehicleType) {
        //Nurdöölöt
        return 16*this.getEngineCapacity()* this.calculateYearMultiplier();
    }
}