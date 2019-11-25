package com.epam.comparator;

public class Country implements Comparable<Country> {

    protected String name;
    protected String capital;

    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "{" + name + " : " + capital + "}";
    }

    @Override
    public int compareTo(Country country) {
        return this.name.compareTo(country.name);
    }
}
