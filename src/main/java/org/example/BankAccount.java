package org.example;

public class BankAccount {

//    Create a BankAccount class with private fields for account holder, account number, and balance.
//    Add a constructor and methods: - deposit(double amount) - withdraw(double amount) - getBalance()
//A deposit or withdrawal must be greater than zero. A withdrawal cannot exceed the balance.
// Invalid operations must not change the balance. Test valid and invalid transactions.

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

        System.out.println("Available balance " + this.balance);
    }

}
