package com.epam.comparator;

import java.util.*;

public class Main {

    public static void main(String[] args) {

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

//        compare by field 'name'
        Arrays.sort(countries);
        list.sort(Country::compareTo);
        System.out.println("--------------------- compare by field 'name' ----------");
        System.out.println("Array: " + Arrays.toString(countries));
        System.out.println(" List: " + list.toString());

//        compare by field 'capital'
        Comparator<Country> comparator = Comparator.comparing(Country::getCapital);
        Arrays.sort(countries, comparator);
        list.sort(comparator);
        System.out.println("--------------------- compare by field 'capital' -------");
        System.out.println("Array: " + Arrays.toString(countries));
        System.out.println(" List: " + list.toString());

//        binary search
        System.out.println("--------------------- binary search by field 'name' -------");
        System.out.println("{China: aaa} index = " + Arrays.binarySearch(countries,
                new Country("China", "Kyiv")));
        System.out.println("{China: aaa} index = " + Collections.binarySearch(list,
                new Country("China", "Kyiv"), null));

        System.out.println("--------------------- binary search by field 'capital' -------");
        System.out.println("{bbb: Brussels} index = " + Arrays.binarySearch(countries,
                new Country("Ukraine", "Brussels"), comparator));
        System.out.println("{bbb: Brussels} index = " + Collections.binarySearch(list,
                new Country("Ukraine", "Brussels"), comparator));
    }
}
