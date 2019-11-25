package com.epam.priority_queue;

public class Car implements Comparable<Car> {

    protected String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Car car) {
        return this.name.compareTo(car.name);
    }
}
