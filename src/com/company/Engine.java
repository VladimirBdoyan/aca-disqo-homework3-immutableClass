package com.company;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 13.07.2021.
 * Time: 21:45.
 */
public class Engine {
    private int horsePower;
    private int weight;
    private int mileage;

    public Engine(int horsePower, int weight, int mileage) {
        this.horsePower = horsePower;
        this.weight = weight;
        this.mileage = mileage;
    }
    // Defensive copy - Is create new object and that fields initialize class object fields
    protected Engine copy(){
        Engine clone = new Engine();
        clone.setHorsePower(this.horsePower);
        clone.setWeight(this.weight);
        clone.setMileage(this.mileage);
        return clone;
    }

    public Engine() {
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
