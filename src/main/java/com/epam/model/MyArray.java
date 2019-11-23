package com.epam.model;

public class MyArray {
    private int[] array;
    private int max = 10;

    public int[] MyArray(int size) {
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ++max);
        }
        return array;
    }

}
