package com.epam.wild_card;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("aaa");
        stringList.add("bbb");
        stringList.add("ccc");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(111);
        integerList.add(222);
        integerList.add(333);

        printList1(stringList);
        printList1(integerList);

        List<?> newList = stringList;
//        newList.add("ddd"); //cannot be applied
        newList.add(null);

//        --------------------------------------------------------------
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        printList2(animals);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        printList2(dogs);

        addToList3(dogs, new Dog());
        addToList4(animals, new Animal());
        addToList5(animals, new Dog());
    }

    public static void printList1(List<?> list) {
        System.out.println("----------- printList1");
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void printList2(List<? extends Animal> list) {
        System.out.println("----------- printList2");
        for (Animal an : list) {
            System.out.println(an);
        }
//        list.add(new Animal()); //cannot be applied
        list.add(null);
    }

    public static void addToList2(List<? extends Animal> list, Animal animal) {
//        list.add(animal); //cannot be applied
        list.add(null);
    }

    public static void addToList3(List<? super Dog> list, Dog dog) {
        list.add(dog);
    }

    public static void addToList4(List<? super Dog> list, Animal animal) {
//        list.add(animal); //cannot be applied
        System.out.println("----------- addToList4");
        System.out.println(list.contains(animal));
    }

    public static void addToList5(List<? super Animal> list, Dog dog) {
        list.add(dog);
        System.out.println("----------- addToList5");
        System.out.println(list.contains(dog));
        for (Object obj : list) {
            System.out.println(obj);

        }
    }

}
