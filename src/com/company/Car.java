package com.company;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 13.07.2021.
 * Time: 21:44.
 */
// Car is Immutable class
final public class Car {
    private final int productionYear;
    private final String model;
    private final String mark;
    private final Engine engine;

    // Тhe constructor takes a mutable object "engine" ,
    // if we want to create immutable object we must have to make a defensive copy in the constructor

    public Car(int productionYear, String model, String mark, Engine engine) {
        this.productionYear = productionYear;
        this.model = model;
        this.mark = mark;
        this.engine = engine.copy();
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public Engine getEngine() {
        return engine.copy();
    }
}
