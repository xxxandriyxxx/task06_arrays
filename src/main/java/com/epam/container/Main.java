package com.epam.container;

import com.epam.array.model.ArrayBusinessLogic;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        StringContainer<String> container = new StringContainer<>();
        container.add("aaa");
        container.add("bbb");
        container.add("ccc");
        container.add("fff");
        container.add("www");
        System.out.println("--------------------------- add()");
        System.out.println(container.toString());

        container.remove(2);
        System.out.println("--------------------------- remove(index = 2)");
        System.out.println(container.toString());

        container.remove("fff");
        System.out.println("--------------------------- remove('fff')");
        System.out.println(container.toString());

        Timer timer = new Timer();
        ArrayBusinessLogic arrayBusinessLogic = new ArrayBusinessLogic();
        int[] intArray = arrayBusinessLogic.generateArray(10000);
        StringContainer<String> container2 = new StringContainer<>();
        List<String> list = new ArrayList<>();
        System.out.println("=================== performance comparison of adding 10000 elements");

        timer.start();
        for (int i = 0; i < intArray.length; i++) {
            container2.add(Integer.toString(intArray[i]));
        }
        timer.stop();
        System.out.println("Container : " + timer);

        timer.start();
        for (int i = 0; i < intArray.length; i++) {
            list.add(Integer.toString(intArray[i]));
        }
        timer.stop();
        System.out.println("ArrayList : " + timer);
    }
}
