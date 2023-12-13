package com.mycode.designpatternsstructuralfacade.entities;

import com.mycode.designpatternsstructuralfacade.entities.third_party_library.ATM;
import com.mycode.designpatternsstructuralfacade.entities.third_party_library.BankAccount;

public class ATMFacade {
    private final ATM atm;

    public ATMFacade() {
        this.atm = new ATM();
    }

    public boolean withdrawMoney(String username, String password, Integer amount) {
        boolean isFetched = atm.fetchAccounts();

        if (!isFetched) {
            System.out.println("Couldn't Fetch Accounts, Try Again Later...");
            return false;
        }
        if (username == null || username.isEmpty()) {
            System.out.println("Username Is Needed To Access Your Account...");
            return false;
        }
        if (password == null || password.isEmpty()) {
            System.out.println("Password Is Needed To Access Your Account...");
            return false;
        }
        if (amount <= 0) {
            System.out.println("Can't Withdraw This Amount From Your Account...");
            return false;
        }

        BankAccount account = atm.findAccount(username, password);
        if (account == null) {
            System.out.println("Couldn't Find This Account...");
            return false;
        }

        boolean isWithdrawd = atm.withdrawMoney(account, amount);
        if (!isWithdrawd) {
            System.out.println("Couldn't Withdraw This Amount, Try Again Later...");
            return false;
        }

        System.out.println("You Have Withdraw :: " + amount + " Successfully From Your Account...");
        atm.printReceipt(account);
        return true;
    }
}
