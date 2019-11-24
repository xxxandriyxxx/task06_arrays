package com.epam.model;

public interface ArrayModel {

    int[] generateArray(int size);

    int[] copyArray(int[] destArray, int[] srcArray);

    int[] deleteDuplicates(int[] array, int maxRepeatNumber);

    int[] deleteTogetherDuplicates (int[] array);

}
