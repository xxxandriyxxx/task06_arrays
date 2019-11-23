package com.epam.model;

public interface ArrayModel {

    int[] generateArray(int size);

    int[] copyArray(int[] initialArray, int[] cloneArray);

    int[] deleteDublicates(int[] array, int maxRepeatNumber);

    int[] deleteTogetherDublicates (int[] array);

}
