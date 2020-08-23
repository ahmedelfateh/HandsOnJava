package com.startOOP;

public class Car {

    // this class contain a car temp

    private int door;
    private int wheels;
    private String color;
    private String model;
    private String engine;

    public Car(int door, int wheels, String color, String model, String engine) {
        this.door = door;
        this.wheels = wheels;
        this.color = color;
        this.model = model;
        this.engine = engine;
    }

    public Car(String color, String model, String engine) {
        this(4, 5, color, model, engine);
    }

    public void carRun(int kilo) {
        System.out.println("you car go " + kilo + " kilo");
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        if (door > 6) {
            System.out.println("there is no such car");
        }
        this.door = door;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

}