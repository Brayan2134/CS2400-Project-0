// AUTHOR: BRAYAN QUEVEDO RAMOS
// FILENAME: BankAccount.java
// SPECIFICATION: Learning to use polymorphism and inheritance.
// FOR: CS 1400 - ASSIGNMENT #7
// TIME SPENT: 45 minutes.
public abstract class BankAccount {
    protected double balance;


    /*
    * CONSTRUCTORS
    * */

    // Constructs an empty bank account with a zero balance.
    public BankAccount(){
        this.balance = 0.0;
    }

    // Constructs a bank account with a given balance.
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    /*
    * GENERAL METHODS
    * */


    // Deposits money into the bank account.
    public void deposit(double amount){
        this.balance += amount;
    }


    // Withdraws money from the bank account.
    public void withdraw (double amount){
        this.balance -= amount;
    }


    // Transfers money from the bank account to another account.
    public void transfer(double amount, BankAccount other){
        other.deposit(amount);
        this.balance -= amount;
    }


    // NA
    public abstract void close(BankAccount other);



    /*
    * GETTERS
    * */


    // Gets the current balance of the bank account.
    public double getBalance(){
        return this.balance;
    }
}
