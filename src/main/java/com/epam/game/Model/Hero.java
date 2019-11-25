package com.epam.game.Model;

public class Hero {

    int health;

    public Hero() {
        health = 25;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                '}';
    }
}
