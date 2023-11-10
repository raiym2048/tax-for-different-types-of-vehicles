//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.demo.entities;

import com.example.demo.enums.VehicleType;

public abstract class Vehicle {
    private int engineCapacity;
    private int manufactureYear;
    private VehicleType vehicleType;

    public Vehicle(int engineCapacity, int manufactureYear, VehicleType vehicleType) {
        this.engineCapacity = engineCapacity;
        this.manufactureYear = manufactureYear;
        this.vehicleType = vehicleType;
    }

    public int getEngineCapacity() {
        return this.engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getManufactureYear() {
        return this.manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public abstract int calculateTax(VehicleType vehicleType);

    protected int calculateYearMultiplier() {
        int currentYear = 2023;
        int yearsSinceManufacture = currentYear - this.getManufactureYear();
        if (yearsSinceManufacture <= 5) {
            return 5;
        } else if (yearsSinceManufacture <= 10) {
            return 4;
        } else {
            return yearsSinceManufacture <= 15 ? 2 : 1;
        }
    }
}
