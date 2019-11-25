package com.epam.game.Controller;

import com.epam.game.Model.BusinessLogic;

public class ControllerImpl implements Controller {

    BusinessLogic businessLogic;

    public ControllerImpl() {
        this.businessLogic = new BusinessLogic();
    }

    public void getDoors() {
        businessLogic.getDoors();
    }

    public void dieImmediately() {
        businessLogic.dieImmediately();
    }

    public void winImmediately() {
        businessLogic.winImmediately();
    }

}
