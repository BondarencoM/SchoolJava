package com.company.bank;

public class BankTeller {

    public void deposit(BankAccount account, double amount) {
        boolean result = account.deposit(amount);
        if (result) {
            System.out.println("Successful deposit of $" + amount);
        } else {
            System.out.println("Error!");
        }
    }

    public void withdraw(BankAccount account, double amount) {
        boolean result = account.withdraw(amount);
        if (result) {
            System.out.println("Successful withdraw of $" + amount);
        } else {
            System.out.println("Error!");
        }
    }
    public void transfer (BankAccount from, BankAccount to, double amount) {
    	if(from.getBalance() /2 < amount ) {
    		System.out.println("Error! ammount "+amount+" ist too high");
    		return;
    	}
    	this.withdraw(from, amount);
    	this.deposit(to, amount);
    }
}
