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
        int[] newArray = new int[0];
        boolean[] duplicates = new boolean[array.length];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (!duplicates[i]) {
                for (int j = i; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        counter++;
                        if (counter > maxRepeatNumber) {
                            duplicates[j] = true;
                        }
                    }
                }
                counter = 0;
            }
        }
        for (int i = 0; i < duplicates.length; i++) {
            if (!duplicates[i]) {
                newArray = copyArray(newArray, new int[]{array[i]});
            }
        }
        return newArray;
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
        if (array[array.length - 2] != array[array.length - 1]) {
            newArray = copyArray(newArray, new int[]{array[array.length - 1]});
        }
        return newArray;
    }
}
