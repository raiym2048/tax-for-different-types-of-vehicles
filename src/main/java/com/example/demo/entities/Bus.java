package com.example.demo.entities;

import com.example.demo.enums.VehicleType;

public class Bus extends Vehicle {
    public Bus(int engineCapacity, int manufactureYear) {
        super(engineCapacity, manufactureYear, VehicleType.BUS);
    }

    public int calculateTax(VehicleType vehicleType) {

        return 15*this.getEngineCapacity()* this.calculateYearMultiplier();
    }
}
