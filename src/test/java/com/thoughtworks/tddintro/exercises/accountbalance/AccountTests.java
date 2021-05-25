package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account depAccount = new Account();
        depAccount.deposit(5);
        assertThat(depAccount.getBalance(), is(5));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        Account withAccount = new Account(8);
        withAccount.withdraw(7);
        assertThat(withAccount.getBalance(), is(1));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        Account withAccount = new Account(8);
        withAccount.withdraw(9);
        assertThat(withAccount.getBalance(), is(8));
    }
}
