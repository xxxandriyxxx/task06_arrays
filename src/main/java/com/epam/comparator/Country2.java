package com.epam.comparator;

public class Country2 extends Country {

    public Country2(String name, String capital) {
        super(name, capital);
    }

    @Override
    public int compareTo(Country country) {
        return this.capital.compareTo(country.capital);
    }
}
