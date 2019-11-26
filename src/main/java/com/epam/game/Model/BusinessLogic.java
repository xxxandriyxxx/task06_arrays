package com.epam.game.Model;

public class BusinessLogic implements Model {

    private Door[] doors;
    private Hero hero;
    private boolean[] opened = new boolean[10];
    private boolean firstTime = true;
    private int counter = 0;
    private int counterBefore = 0;

    public BusinessLogic() {
        hero = new Hero();
    }

    @Override
    public void showHero() {
        System.out.println(hero);
    }

    @Override
    public void getDoors() {
        doors = new Door[10];
        for (int i = 0; i < doors.length; i++) {
            doors[i] = new Door();
        }
        for (int i = 0; i < doors.length; i++) {
            System.out.print("\nDoor " + (i + 1) + ": ");
            if (doors[i].isMonster) {
                System.out.print(doors[i].monster);
            } else {
                System.out.print("Artifact: " + doors[i].artifact);
            }
        }
    }

    @Override
    public void dieImmediately() {
        System.out.println("\n-------------------------------------");
        System.out.print("Will DIE immediately if opens the next doors: ");
        for (int i = 0; i < doors.length; i++) {
            if (doors[i].isMonster && (doors[i].monster.health > 25)) {
                System.out.print(i + 1 + "   ");
            }
        }
    }

    @Override
    public void winImmediately() {
        System.out.println("\n-------------------------------------");
        System.out.print("Will WIN immediately if opens the next doors: ");
        for (int i = 0; i < doors.length; i++) {
            if (doors[i].isMonster && (doors[i].monster.health <= 25)) {
                System.out.print(i + 1 + "   ");
            }
        }
    }

    @Override
    public void winSequence() {
        System.out.println("\n-------------------------------------");
        System.out.print("The door opening sequence for winning: ");
        openDoor();
    }

    private void openDoor() {
        if (counter == 10) {
            System.out.print("WIN!!!\n");
            return;
        }
        if (!firstTime && (counter == counterBefore)) {
            System.out.print("DEATH!!! doors:");
            for (int i = 0; i < opened.length; i++) {
                if (!opened[i]) {
                    System.out.print(i + 1 + "   ");
                }
            }
        } else {
            counterBefore = counter;
            for (int i = 0; i < doors.length; i++) {
                if (!opened[i]) {
                    if (!doors[i].isMonster) {
                        hero.health += doors[i].artifact;
                        System.out.print(i + 1 + "   ");
                        opened[i] = true;
                        counter++;
                    } else if (doors[i].isMonster && (doors[i].monster.health <= hero.health)) {
                        System.out.print(i + 1 + "   ");
                        opened[i] = true;
                        counter++;
                    }
                }
            }
            firstTime = false;
            openDoor();
        }
    }
}
