package com.epam.game.Model;

public class BusinessLogic implements Model {
    Door[] doors;

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

    public void dieImmediately() {
        System.out.println("\n-------------------------------------");
        System.out.print("Will DIE immediately if opens the next doors: ");
        for (int i = 0; i < doors.length; i++) {
            if (doors[i].isMonster && (doors[i].monster.health > 25)) {
                System.out.print(i + 1 + "   ");
            }
        }
    }

    public void winImmediately() {
        System.out.println("\n-------------------------------------");
        System.out.print("Will WIN immediately if opens the next doors: ");
        for (int i = 0; i < doors.length; i++) {
            if (doors[i].isMonster && (doors[i].monster.health <= 25)) {
                System.out.print(i + 1 + "   ");
            }
        }
    }
}
