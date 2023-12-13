package com.mycode.designpatternsstructuralfacade.entities.third_party_library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ATM {
    private final Map<BankAccount, Integer> accounts;

    public ATM() {
        accounts = new HashMap<>();
    }

    public boolean fetchAccounts() {
        if (!accounts.isEmpty())
            return false;

        accounts.put(new BankAccount("ahmed", "12345"), 5000);
        accounts.put(new BankAccount("peter", "72638"), 7000);
        accounts.put(new BankAccount("poula", "13579"), 9000);
        accounts.put(new BankAccount("atef", "24680"), 10000);
        return true;
    }

    public boolean withdrawMoney(BankAccount account, Integer amount) {
        if (account == null) {
            System.out.println("Account Is Needed For The Withdrawal...");
            return false;
        }

        if (accounts.get(account) < amount) {
            System.out.println("Couldn't Withdraw This Amount From Your Account...");
            return false;
        }

        accounts.put(account, accounts.get(account) - amount);
        return true;
    }

    public BankAccount findAccount(String username, String password) {
        return accounts
                .keySet()
                .stream()
                .filter(account -> account.getUsername().equals(username) && account.getPassword().equals(password))
                .findFirst()
                .orElse(null);
    }

    public void printReceipt(BankAccount account) {
        System.out.println("Your Current Balance Is :: " + accounts.get(account));
    }
}
