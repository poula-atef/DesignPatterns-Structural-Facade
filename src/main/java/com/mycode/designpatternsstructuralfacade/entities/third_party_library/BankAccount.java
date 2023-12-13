package com.mycode.designpatternsstructuralfacade.entities.third_party_library;

import lombok.Getter;

@Getter
public class BankAccount {
    private String username;
    private String password;

    public BankAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
