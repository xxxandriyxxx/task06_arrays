package com.epam.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        compare by field 'name'
        Country[] countries = new Country[10];
        List<Country> list = new ArrayList<>();
        countries[0] = new Country("Albania", "Tirana");
        countries[1] = new Country("Malta", "Valletta");
        countries[2] = new Country("Belgium", "Brussels");
        countries[3] = new Country("Croatia", "Zagreb");
        countries[4] = new Country("Denmark", "Copenhagen");
        countries[5] = new Country("Turkey", "Ankara");
        countries[6] = new Country("Ukraine", "Kyiv");
        countries[7] = new Country("Spain", "Madrid");
        countries[8] = new Country("China", "Beijing");
        countries[9] = new Country("Austria", "Vienna");
        for (int i = 0; i < countries.length; i++) {
            list.add(countries[i]);
        }
        Arrays.sort(countries);
        list.sort(Country::compareTo);
        System.out.println("--------------------- compare by field 'name' ----------");
        System.out.println("Array: " + Arrays.toString(countries));
        System.out.println(" List: " + list.toString());

//        compare by field 'capital'
        Country2[] countries2 = new Country2[10];
        List<Country2> list2 = new ArrayList<>();
        countries2[0] = new Country2("Albania", "Tirana");
        countries2[1] = new Country2("Malta", "Valletta");
        countries2[2] = new Country2("Belgium", "Brussels");
        countries2[3] = new Country2("Croatia", "Zagreb");
        countries2[4] = new Country2("Denmark", "Copenhagen");
        countries2[5] = new Country2("Turkey", "Ankara");
        countries2[6] = new Country2("Ukraine", "Kyiv");
        countries2[7] = new Country2("Spain", "Madrid");
        countries2[8] = new Country2("China", "Beijing");
        countries2[9] = new Country2("Austria", "Vienna");
        for (int i = 0; i < countries2.length; i++) {
            list2.add(countries2[i]);
        }
        Arrays.sort(countries2);
        list2.sort(Country::compareTo);
        System.out.println("--------------------- compare by field 'capital' -------");
        System.out.println("Array: " + Arrays.toString(countries2));
        System.out.println(" List: " + list2.toString());


//        binary search
        System.out.println("--------------------- binary search by field 'name' -------");
        System.out.println("{China: Kyiv} index = " + Arrays.binarySearch(countries,
                new Country("China", "Kyiv")));
        System.out.println("{China: Kyiv} index = " + Collections.binarySearch(list,
                new Country("China", "Kyiv"), null));

        System.out.println("--------------------- binary search by field 'capital' -------");
        System.out.println("{Ukraine: Brussels} index = " + Arrays.binarySearch(countries2,
                new Country("Ukraine", "Brussels")));
        System.out.println("{Ukraine: Brussels} index = " + Collections.binarySearch(list2,
                new Country("Ukraine", "Brussels"), null));
    }
}
