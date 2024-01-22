// AUTHOR: BRAYAN QUEVEDO RAMOS
// FILENAME: BankAccount.java
// SPECIFICATION: Learning to use polymorphism and inheritance.
// FOR: CS 1400 - ASSIGNMENT #7
// TIME SPENT: 45 minutes.


/**
 * Represents an abstract bank account. This class serves as a base class for different types of bank accounts.
 * It provides basic functionality common to all bank accounts, such as depositing, withdrawing, and transferring funds.
 */
public abstract class BankAccount {

    protected double balance; // The current balance in the bank account

    /*
    * CONSTRUCTORS
    * */

    /**
     * Default constructor which initializes the bank account with a zero balance.
     */
    public BankAccount(){
        this.balance = 0.0;
    }

    /**
     * Constructs a bank account with a specified initial balance.
     * @param initialBalance the initial balance to set for the account
     */
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    /*
    * GENERAL METHODS
    * */


    /**
     * Deposits a specified amount into the bank account.
     * @param amount the amount to deposit
     */
    public void deposit(double amount){
        this.balance += amount;
    }


    /**
     * Withdraws a specified amount from the bank account.
     * @param amount the amount to withdraw
     */
    public void withdraw (double amount){
        this.balance -= amount;
    }


    /**
     * Transfers a specified amount from this bank account to another bank account.
     * @param amount the amount to transfer
     * @param other the bank account to transfer the amount to
     */
    public void transfer(double amount, BankAccount other){
        other.deposit(amount);
        this.balance -= amount;
    }


    /**
     * Abstract method to close the bank account. Specific implementations may vary in subclasses.
     * @param other the bank account to which any remaining balance should be transferred
     */
    public abstract void close(BankAccount other);



    /*
    * GETTERS
    * */


    // Gets the current balance of the bank account.
    public double getBalance(){
        return this.balance;
    }
}
