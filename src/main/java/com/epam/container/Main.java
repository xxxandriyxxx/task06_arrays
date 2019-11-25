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
        
    }
}
