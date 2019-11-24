package com.epam.model;

public interface ArrayModel {

    int[] generateArray(int size);

    int[] copyArray(int[] destArray, int[] srcArray);

    int[] copyPresentInBoth(int[] srcArray1, int[] srcArray2);

    int[] copyPresentInOne(int[] srcArray1, int[] srcArray2);

    int[] deleteDuplicates(int[] array, int maxRepeatNumber);

    int[] deleteTogetherDuplicates(int[] array);

}
