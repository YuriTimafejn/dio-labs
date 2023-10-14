package com.timafejn.domain.entities;

import java.math.BigDecimal;

public class CommonAccount extends Account{
    public CommonAccount() {
        super();
    }

    @Override
    public boolean deposit(double amount) {
        this.balance = this.balance.add(BigDecimal.valueOf(amount));
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if(this.isBalanceEnough(amount)) {
            this.balance = this.balance.subtract(BigDecimal.valueOf(amount));
            return true;
        }

        System.out.println("Não foi possivel realizar a operação");
        return false;
    }

    @Override
    public void transfer(AccountInterface toAccount, double amount) {
        if (this.withdraw(amount))
        {
            toAccount.deposit(amount);
        }
    }
}
