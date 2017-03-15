package com.codeclan.fastcars;

/**
 * Created by Adam Baxter on 15/03/2017.
 */

public class Car {

    private String model;
    private String manufacturer;
    private String lapTime;


    public Car(String manufacturer, String model, String lapTime) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.lapTime = lapTime;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getLapTime() {
        return lapTime;
    }
}
