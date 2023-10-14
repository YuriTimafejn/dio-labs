package com.timafejn;

import com.timafejn.domain.entities.Account;
import com.timafejn.domain.entities.CommonAccount;
import com.timafejn.domain.entities.MerchantAccount;

public class Main {
    public static void main(String[] args) {
        Account account = new CommonAccount();
        Account account1 = new MerchantAccount();

        System.out.println("***********************");
        System.out.println(account);
        System.out.println("***********************");
        System.out.println(account1);
        System.out.println("***********************");
    }
}