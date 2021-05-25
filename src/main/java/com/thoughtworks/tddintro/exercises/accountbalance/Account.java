package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance;

    public Account() {
        this.balance = 0;
    }

    public Account(int initialBalance){
        this.balance = initialBalance;
    }

    public void deposit(int amount){
        this.balance = this.balance + amount;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if(amount <= getBalance()){
            this.balance = this.balance - amount;
        }
    }
}
