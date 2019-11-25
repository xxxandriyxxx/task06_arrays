package com.epam.game.View;

import com.epam.game.Controller.Controller;
import com.epam.game.Controller.ControllerImpl;
import com.epam.game.Model.Hero;

public class View {

    private Controller controller;
    private Hero hero;

    public View() {
        controller = new ControllerImpl();
        hero = new Hero();
    }

    public void show() {
        System.out.println(hero);
        controller.getDoors();
        controller.dieImmediately();
        controller.winImmediately();
    }

}
