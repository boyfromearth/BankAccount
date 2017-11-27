package Mod2.test;

import Mod2.domain.Account;

/**
 * @author boyfromearth
 */
public class TestAccount {

    public static void main(String[] args) {
        Account myAccount = new Account(-100.00);
        myAccount.deposit(120.00);
        myAccount.withdraw(120.00);
        myAccount.withdraw(400.00);
        System.out.println("Account balance is " + myAccount.getBalance());
    }}
