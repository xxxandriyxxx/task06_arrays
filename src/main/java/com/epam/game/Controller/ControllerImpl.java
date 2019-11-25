package com.epam.game.Controller;

import com.epam.game.Model.BusinessLogic;

public class ControllerImpl implements Controller{

    BusinessLogic businessLogic;

    public ControllerImpl() {
        this.businessLogic = new BusinessLogic();
    }

}
