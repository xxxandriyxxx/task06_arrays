package com.epam.array;


import com.epam.array.model.ArrayBusinessLogic;

import java.util.Arrays;

public class Main {
    int[] srcArray = {1, 2, 3};
    int[] destArray = {4, 5, 6, 7};
    int[] duplicatesArray = {1, 1, 1, 8, 1, 2, 2, 3, 4, 5, 5, 5, 6, 7, 7, 8, 8, 8, 8, 1, 1};
    int[] duplicatesArray2 = {1, 8, 2, 2, 3, 4, 5, 5, 5, 6, 7, 7, 8, 8, 8, 8, 1, 1};

    int[] duplicatesArray3 = {10, 1, 1, 8, 1, 2, 2, 10, 10, 3, 4, 5, 5, 5, 6, 20, 7, 7, 8, 8, 8, 8, 1, 1, 30, 30, 70};
    int[] duplicatesArray4 = {40, 40, 1, 8, 2, 2, 3, 4, 5, 5, 5, 50, 50, 6, 7, 7, 8, 8, 70, 8, 8, 1, 1, 60, 60};

    ArrayBusinessLogic arrayBusinessLogic = new ArrayBusinessLogic();
    static Main app = new Main();

    public static void main(String[] args) {

        app.getArray();
        app.copyArray();
        app.copyArray2();
        app.deleteTogetherDuplicates();
        app.deleteDuplicates();
        app.findDuplOne();
        app.findDuplBoth();


    }


    private void getArray() {
        int[] array = arrayBusinessLogic.generateArray(12);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    private void copyArray() {
        int[] array = arrayBusinessLogic.copyArray(destArray, srcArray);
        System.out.println("\n------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    private void copyArray2() {
        int[] array = arrayBusinessLogic.copyArray(new int[0], srcArray);
        System.out.println("\n------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    private void deleteTogetherDuplicates() {
        System.out.println("\n------");

        for (int i = 0; i < duplicatesArray.length; i++) {
            System.out.print(duplicatesArray[i] + ", ");
        }
        System.out.print("\n");

        duplicatesArray = arrayBusinessLogic.deleteTogetherDuplicates(duplicatesArray);
        for (int i = 0; i < duplicatesArray.length; i++) {
            System.out.print(duplicatesArray[i] + ", ");
        }
    }

    private void deleteDuplicates() {
        System.out.println("\n-------");

        for (int i = 0; i < duplicatesArray2.length; i++) {
            System.out.print(duplicatesArray2[i] + ", ");
        }
        System.out.print("\n");
        duplicatesArray2 = arrayBusinessLogic.deleteDuplicates(duplicatesArray2, 2);
        System.out.print("\n");

        System.out.println(Arrays.toString(duplicatesArray2));
    }


    private void findDuplOne() {
        System.out.println("\n-------");
        System.out.println(Arrays.toString(duplicatesArray3));
        System.out.println(Arrays.toString(duplicatesArray4));

        int[] array = arrayBusinessLogic.copyPresentInOne(duplicatesArray3, duplicatesArray4);
        System.out.println(Arrays.toString(array));

    }

    private void findDuplBoth() {
        System.out.println("\n-------");
        System.out.println(Arrays.toString(duplicatesArray3));
        System.out.println(Arrays.toString(duplicatesArray4));

        int[] array = arrayBusinessLogic.copyPresentInBoth(duplicatesArray3, duplicatesArray4);

        System.out.println(Arrays.toString(array));


    }


}
