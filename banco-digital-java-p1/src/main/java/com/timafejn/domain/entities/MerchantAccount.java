package com.timafejn.domain.entities;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MerchantAccount extends Account{
    private static final double MERCHANT_TAX = 2.99;
    @Override
    public boolean deposit(double amount) {
        this.setBalance(this.balance.add(BigDecimal.valueOf(amount)));

        super.newBalance();
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if(this.isBalanceEnough(amount + MERCHANT_TAX))
            this.setBalance(this.balance.subtract(BigDecimal.valueOf(amount + MERCHANT_TAX)));

        super.newBalance();
        return true;
    }

    @Override
    public void transfer(AccountInterface toAccount, double amount) {
        if(this.isBalanceEnough(amount)) {
            this.withdraw(amount);
            toAccount.deposit(amount);

            super.newBalance();
        }
    }


}
