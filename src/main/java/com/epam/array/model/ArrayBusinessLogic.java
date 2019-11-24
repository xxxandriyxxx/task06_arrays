package com.epam.array.model;

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
    public int[] copyPresentInBoth(int[] srcArray1, int[] srcArray2) {
        int[] newArray = new int[0];
        boolean[] dublicatesInArray1;
        boolean[] dublicatesInArray2;
        srcArray1 = deleteDuplicates(srcArray1, 1);
        srcArray2 = deleteDuplicates(srcArray2, 1);
        dublicatesInArray1 = findDuplicatesInAnother(srcArray1, srcArray2);
        dublicatesInArray2 = findDuplicatesInAnother(srcArray2, srcArray1);
        srcArray1 = removeElementsByLabel(srcArray1,dublicatesInArray1,true);
        srcArray2 = removeElementsByLabel(srcArray2,dublicatesInArray2,true);
        newArray = copyArray(newArray,srcArray1);
        newArray = copyArray(newArray,srcArray2);
        newArray = deleteDuplicates(newArray, 1);
        return newArray;
    }

    @Override
    public int[] copyPresentInOne(int[] srcArray1, int[] srcArray2) {
        int[] newArray = new int[0];
        boolean[] dublicatesInArray1;
        boolean[] dublicatesInArray2;
        srcArray1 = deleteDuplicates(srcArray1, 1);
        srcArray2 = deleteDuplicates(srcArray2, 1);
        dublicatesInArray1 = findDuplicatesInAnother(srcArray1, srcArray2);
        dublicatesInArray2 = findDuplicatesInAnother(srcArray2, srcArray1);
        srcArray1 = removeElementsByLabel(srcArray1,dublicatesInArray1,false);
        srcArray2 = removeElementsByLabel(srcArray2,dublicatesInArray2,false);
        newArray = copyArray(newArray,srcArray1);
        newArray = copyArray(newArray,srcArray2);
        newArray = deleteDuplicates(newArray, 1);
        return newArray;
    }

    private boolean[] findDuplicatesInAnother(int[] array, int[] duplicatesArray) {
        boolean[] duplicates = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < duplicatesArray.length; j++) {
                if (array[i] == duplicatesArray[j]) {
                    duplicates[i] = true;
                }
            }
        }
        return duplicates;
    }

    private int[] removeElementsByLabel(int[] array, boolean[] labels, boolean label){
        int[] newArray = new int[0];
        for (int i = 0; i < labels.length; i++) {
            if (labels[i] == label) {
                newArray = copyArray(newArray, new int[]{array[i]});
            }
        }
        return newArray;
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
        newArray = removeElementsByLabel(array,duplicates,false);
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
