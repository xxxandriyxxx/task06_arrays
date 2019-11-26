package com.epam.comparator;

public class Country implements Comparable<Country> {

    private String name;
    private String capital;

    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
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
