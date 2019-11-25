package com.epam.queue;

public class Car implements Comparable<Car> {

    protected String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car " + name;
    }

    @Override
    public int compareTo(Car o) {
        return 0;
    }
}
