package org.example;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder,String accountNumber,double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount >= 0){
            balance = balance + amount;
            System.out.println("Deposit was successful");
        }
        else{
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance ){
            balance = balance - amount;
            System.out.println("Withdrawal was successful");
        }
        else{
            System.out.println("Insuffient funds");
        }
    }

    public void getBalance(){
        System.out.println("Available balance " + balance);
    }

}
