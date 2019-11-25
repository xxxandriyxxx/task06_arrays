package com.epam.array;

import com.epam.array.model.ArrayBusinessLogic;

import java.util.Arrays;

public class Main {
    private int[] srcArray = {1, 2, 3};
    private int[] destArray = {4, 5, 6, 7};
    private int[] duplicatesArray = {1, 1, 1, 8, 1, 2, 2, 3, 4, 5, 5, 5, 6, 7, 7, 8, 8, 8, 8, 1, 1};
    private int[] duplicatesArray2 = {1, 8, 2, 2, 3, 4, 5, 5, 5, 6, 7, 7, 8, 8, 8, 8, 1, 1};
    private int[] duplicatesArray3 = {10, 1, 1, 8, 1, 2, 2, 10, 10, 3, 4, 5, 5, 5, 6, 20, 7, 7, 8, 8, 8, 8, 1, 1, 30, 30, 70};
    private int[] duplicatesArray4 = {40, 40, 1, 8, 2, 2, 3, 4, 5, 5, 5, 50, 50, 6, 7, 7, 8, 8, 70, 8, 8, 1, 1, 60, 60};
    private ArrayBusinessLogic arrayBusinessLogic = new ArrayBusinessLogic();
    private static Main app = new Main();

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
        System.out.println("----------- get random array");
        System.out.println(Arrays.toString(array));
    }

    private void copyArray() {
        int[] array = arrayBusinessLogic.copyArray(destArray, srcArray);
        System.out.println("----------- copy two arrays to another one");
        System.out.println(Arrays.toString(destArray));
        System.out.println(Arrays.toString(srcArray));
        System.out.print("result: ");
        System.out.println(Arrays.toString(array));
    }

    private void copyArray2() {
        int[] array = arrayBusinessLogic.copyArray(new int[0], srcArray);
        System.out.println("----------- copy an array to another one");
        System.out.println(Arrays.toString(srcArray));
        System.out.print("new array: ");
        System.out.println(Arrays.toString(array));
    }

    private void deleteTogetherDuplicates() {
        System.out.println("----------- remove consecutive duplicates");
        System.out.println(Arrays.toString(duplicatesArray));
        duplicatesArray = arrayBusinessLogic.deleteTogetherDuplicates(duplicatesArray);
        System.out.print("result: ");
        System.out.println(Arrays.toString(duplicatesArray));
    }

    private void deleteDuplicates() {
        System.out.println("----------- remove duplicates that are repeated more than 2 times");
        System.out.println(Arrays.toString(duplicatesArray2));
        duplicatesArray2 = arrayBusinessLogic.deleteDuplicates(duplicatesArray2, 2);
        System.out.print("result: ");
        System.out.println(Arrays.toString(duplicatesArray2));
    }

    private void findDuplOne() {
        System.out.println("----------- find elements that exist in only one of both arrays");
        System.out.println(Arrays.toString(duplicatesArray3));
        System.out.println(Arrays.toString(duplicatesArray4));
        int[] array = arrayBusinessLogic.copyPresentInOne(duplicatesArray3, duplicatesArray4);
        System.out.print("result: ");
        System.out.println(Arrays.toString(array));
    }

    private void findDuplBoth() {
        System.out.println("----------- find elements that exist in both arrays");
        System.out.println(Arrays.toString(duplicatesArray3));
        System.out.println(Arrays.toString(duplicatesArray4));
        int[] array = arrayBusinessLogic.copyPresentInBoth(duplicatesArray3, duplicatesArray4);
        System.out.print("result: ");
        System.out.println(Arrays.toString(array));
    }

}
