package com.timafejn.domain.entities;

public interface AccountInterface {
    boolean deposit(double amount);
    boolean withdraw(double amount);
    void transfer(AccountInterface toAccount, double amount);
    String getBalance();

    void newBalance();
}
