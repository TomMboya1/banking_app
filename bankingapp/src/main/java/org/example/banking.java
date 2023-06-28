package org.example;

public class banking {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private double totalDeposits;
    private double totalWithdrawals;

    public banking(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited into the account. Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn from the account. Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
    public double calculateTotalDeposits() {

        return totalDeposits;
    }

    public double calculateTotalWithdrawals() {
        return totalWithdrawals;
    }
}
