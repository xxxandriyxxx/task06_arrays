package com.epam.game.Model;

public class Monster {

    int health;
    private final int min = 5;
    private final int max = 100;

    public Monster() {
        health = rnd(min, max);
    }

    private static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
