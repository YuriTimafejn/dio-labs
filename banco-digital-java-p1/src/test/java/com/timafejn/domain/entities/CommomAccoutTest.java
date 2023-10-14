package com.timafejn.domain.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TEST COMMOM ACCOUNT")
class CommomAccoutTest {

    Account account;
    Account account1;
    Account account2;
    Account account3;

    @BeforeEach
    void setUp() {
        account = new CommonAccount();
        account1 = new CommonAccount();
        account2 = new MerchantAccount();
        account3 = new MerchantAccount();
    }

    @Test
    @DisplayName("TEST DEPOSIT")
    void testDeposit() {
        assertTrue(account.deposit(100));
        assertEquals("100,00", account.getBalance());
    }

    @Test
    @DisplayName("TEST WITHDRAW FAILS")
    void testWithdrawFails() {
        account.deposit(100);
        assertFalse(account.withdraw(101));
    }

    @Test
    @DisplayName("TEST WITHDRAW SUCCESS")
    void testWithdrawSuccess() {
        account.deposit(100);
        assertTrue(account.withdraw(100));
    }

    @Test
    @DisplayName("TEST TRANSFER")
    void testTransfer() {
        account2.deposit(100);
        account2.transfer(account3, 50);

        assertEquals("47,01", account2.getBalance());
        assertEquals("50,00", account3.getBalance());
    }
}