package com.epam.game.Model;

import java.util.Random;

public class Door {

    public boolean isMonster;
    public Monster monster;
    public int artifact;
    private final int min = 10;
    private final int max = 80;
    final Random random = new Random();

    public Door() {
        isMonster = random.nextBoolean();
        if (isMonster) {
            monster = new Monster();
        } else {
            artifact = rnd(min, max);
        }
    }

    private static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    @Override
    public String toString() {
        return "Door{" +
                "isMonster=" + isMonster +
                ", monster=" + monster +
                ", artifact=" + artifact +
                '}';
    }
}
