package com.epam.game.Controller;

import com.epam.game.Model.BusinessLogic;
import com.epam.game.Model.Model;

public class ControllerImpl implements Controller {

    private Model model;

    public ControllerImpl() {
        this.model = new BusinessLogic();
    }

    @Override
    public void showHero() {
        model.showHero();
    }

    @Override
    public void getDoors() {
        model.getDoors();
    }

    @Override
    public void dieImmediately() {
        model.dieImmediately();
    }

    @Override
    public void winImmediately() {
        model.winImmediately();
    }

    @Override
    public void winSequence() {
        model.winSequence();
    }
}
