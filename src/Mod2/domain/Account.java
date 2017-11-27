package Mod2.domain;

/**
 * Bank Account class.
 * @author boyfromearth
 */

public class Account {
    private double balance;

    /**
     * Constructor that provides initial balance.
     * @param balance positive account balance
     */
    public Account(double balance) {
        if (balance >= 0)
            this.balance = balance;
        else
            this.balance = 0;
    }

    /**
     * Method to check account balance.
     * @return
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Method to add money to account.
     * @param amt positive amount of money to add
     */
    public void deposit(double amt) {
        if (amt > 0)
            balance += amt;
    }

    /**
     * Method to withdraw money from account
     * @param amt positive amount of money to withdraw
     */
    public void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
        }
    }
}
