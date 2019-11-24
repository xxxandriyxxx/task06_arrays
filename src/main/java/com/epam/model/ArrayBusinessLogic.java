package com.epam.model;

public class ArrayBusinessLogic implements ArrayModel {

    @Override
    public int[] generateArray(int size) {
        return MyArray.getArray(size);
    }

    @Override
    public int[] copyArray(int[] destArray, int[] srcArray) {
        int[] array = new int[destArray.length + srcArray.length];
        System.arraycopy(destArray, 0, array, 0, destArray.length);
        System.arraycopy(srcArray, 0, array, destArray.length, srcArray.length);
        return array;
    }

    @Override
    public int[] deleteDuplicates(int[] array, int maxRepeatNumber) {
        return new int[0];
    }

    @Override
    public int[] deleteTogetherDublicates(int[] array) {
        return new int[0];
    }
}
