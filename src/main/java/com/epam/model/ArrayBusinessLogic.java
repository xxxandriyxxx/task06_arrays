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
    public int[] deleteTogetherDuplicates(int[] array) {
        int[] newArray = new int[0];
        int value;
        for (int i = 0; i < array.length - 1; i++) {
            value = array[i];
            while (value == array[i + 1]) {
                if (i < array.length - 2) {
                    i++;
                } else break;
            }
            newArray = copyArray(newArray, new int[]{value});
        }
        return newArray;
    }
}
