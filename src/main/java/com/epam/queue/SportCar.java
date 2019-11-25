package com.epam.queue;

public class SportCar extends Car {

    public SportCar(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "SportCar " + name;
    }
}
