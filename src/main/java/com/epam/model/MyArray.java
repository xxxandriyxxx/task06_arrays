package com.epam.model;

public class MyArray {
    private static int max = 10;

    static int[] getArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max + 1));
        }
        return array;
    }

}
