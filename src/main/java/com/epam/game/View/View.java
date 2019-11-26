package com.epam.game.View;

import com.epam.game.Controller.Controller;
import com.epam.game.Controller.ControllerImpl;

public class View {

    private Controller controller;

    public View() {
        controller = new ControllerImpl();
    }

    public void show() {
        controller.showHero();
        controller.getDoors();
        controller.dieImmediately();
        controller.winImmediately();
        controller.winSequence();
    }
}
