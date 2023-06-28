package org.example;

public class main {
    public static void main(String[] args) {
        bank bank = new bank();

        // Add new accounts
        bank.addAccount("121215516", "ken tom ", 10000.0);
        bank.addAccount("234524364", "stive me ", 1500.0);

        // Perform transactions
       banking account1 = bank.getAccount("121215516");
        if (account1 != null) {
            account1.deposit(5000.0);
            account1.withdraw(2000.0);
        } else {
            System.out.println("Account not found!");
        }

        banking account2 = bank.getAccount("234524364");
        if (account2 != null) {
            account2.deposit(1500.0);
            account2.withdraw(300.0);
        } else {
            System.out.println("Account not found!");
        }

        // Calculate account statistics
        if (account1 != null) {
            double totalDeposits1 = account1.calculateTotalDeposits();
            double totalWithdrawals1 = account1.calculateTotalWithdrawals();

            System.out.println("Account 1 Total Deposits: " + totalDeposits1);
            System.out.println("Account 1 Total Withdrawals: " + totalWithdrawals1);
        } else {
            System.out.println("Account 1 not found!");
        }

        if (account2 != null) {
            double totalDeposits2 = account2.calculateTotalDeposits();
            double totalWithdrawals2 = account2.calculateTotalWithdrawals();

            System.out.println("Account 2 Total Deposits: " + totalDeposits2);
            System.out.println("Account 2 Total Withdrawals: " + totalWithdrawals2);
        } else {
            System.out.println("Account 2 not found!");
        }
    }
}
