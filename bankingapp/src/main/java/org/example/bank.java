package org.example;

import java.util.ArrayList;
import java.util.List;

public class bank {
    private List<banking> accounts;

    public bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(banking account) {
        accounts.add(account);
    }

    public banking getAccount(String accountNumber) {
        for (banking account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null; // Account not found
    }

    public void addAccount(String accountNumber, String accountHolderName, double initialBalance) {
        for (banking account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println("Account with account number " + accountNumber + " already exists.");
                return;
            }
        }

        banking newAccount = new banking(accountNumber, accountHolderName, initialBalance);
        accounts.add(newAccount);
        System.out.println("Account with account number " + accountNumber + " added successfully.");
    }
}
