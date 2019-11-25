package com.epam.game.Model;

public class BusinessLogic implements Model{


    public void getBoors(){
        Door[] doors = new Door[10];
        for (int i = 0; i < doors.length; i++) {
            doors[i] = new Door();
        }
        for (int i = 0; i < doors.length; i++) {
            System.out.print("\nDoor " + (i + 1) + ": ");
            if (doors[i].isMonster) {
                System.out.print(doors[i].monster);
            } else{
                System.out.print("Artifact: " + doors[i].artifact);
            }
        }
    }

    public void WhereDieImmediately (){

    }
}
