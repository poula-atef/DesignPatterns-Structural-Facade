package com.mycode.designpatternsstructuralfacade;

import com.mycode.designpatternsstructuralfacade.entities.ATMFacade;

public class Main {

    public static void main(String[] args) {
        ATMFacade facade = new ATMFacade();
        facade.withdrawMoney("poula","13579",2000);
    }

}
