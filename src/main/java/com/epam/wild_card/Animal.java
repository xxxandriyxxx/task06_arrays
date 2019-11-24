package com.epam.wild_card;

public class Animal {

    protected final int id;
    private static int counter = 0;

    {
        counter++;
        id = counter;
    }

    @Override
    public String toString() {
        return "Animal " + id;
    }
}
