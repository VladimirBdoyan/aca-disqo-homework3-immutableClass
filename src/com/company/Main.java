package com.company;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine(150,1350,10000);
        Car car = new Car(2001,"Sedan","BMW",engine);
        System.out.println(car.getEngine().getMileage());
        car.getEngine().setMileage(35);
        engine.setMileage(35);
        System.out.println(car.getEngine().getMileage()); // Must not be changed as car object is immutable
        System.out.println(engine.getMileage());
    }
}
