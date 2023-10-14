package com.timafejn.domain.entities;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Date;


public abstract class Account implements AccountInterface {
    private static Long SEQUENCE = 1L;
    private final String DEFAULT_AGENCY = "0001";

    private Long accountId;
    @Getter
    private String agency;
    private LocalDate createdAt = LocalDate.now();
    @Getter
    @Setter
    protected BigDecimal balance = new BigDecimal(0);

    public Account() {
        this.accountId = SEQUENCE;
        this.agency = DEFAULT_AGENCY;
        SEQUENCE++;
    }

    protected boolean isBalanceEnough(double amount) {
        return balance.doubleValue() >= amount;
    }

    @Override
    public String getBalance() {
        DecimalFormat df = new DecimalFormat("#,###,###.00");
        return this.balance.equals(BigDecimal.ZERO) ? "0,00" : df.format(this.balance);
    }

    public void newBalance(){
        System.out.println( "Operação realizada com sucesso!\n\n Seu saldo é de: "
                + this.getBalance() + "\n");
    }

    public String getAccountId(){
        return String.format("%04d", this.accountId);
    }

    public String getCreatedAt(){
        return String.format("%02d/%02d/%04d", this.createdAt.getDayOfMonth(),
                this.createdAt.getMonthValue(), this.createdAt.getYear());
    }

    @Override
    public String toString() {
        return "Conta: " + this.getAccountId() + "\n" +
                "Agencia: " + this.agency + "\n" +
                "cliente desde: " + this.getCreatedAt() + "\n" +
                "Balance: $ " + this.getBalance();

    }
}
