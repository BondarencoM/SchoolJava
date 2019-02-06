package com.company;
import com.company.bank.BankAccount;
import com.company.bank.BankTeller;
import com.company.atm.ATM;

public class Ex1_3 {
    public static void main(String[] args) {
        BankAccount a = new BankAccount(1234,100.00);
        BankAccount b = new BankAccount(1235,400.00);
        BankTeller john = new BankTeller();
        john.deposit(a,100.00);
        ATM xyz = new ATM(222);
        xyz.withdraw(a,50.00);
        
        System.out.println("//Transfer $100 from a to b");
        john.transfer(a, b, 100);
        System.out.println("//Transfer $100 from b to a");
        john.transfer(b, a, 100);
        
        
    }
}