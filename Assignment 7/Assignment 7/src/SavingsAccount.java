// AUTHOR: BRAYAN QUEVEDO RAMOS
// FILENAME: SavingsAccount.java
// SPECIFICATION: Learning to use polymorphism and inheritance.
// FOR: CS 1400 - ASSIGNMENT #7
// TIME SPENT:

/**
 * Represents a savings account with an interest rate. Inherits from the BankAccount class
 * and extends it with savings account-specific features such as interest accrual.
 */
public class SavingsAccount extends BankAccount{
    private double interestRate;


    /*
    * CONSTRUCTORS
    * */


    // Constructs a savings account defining a monthly interest rate and no balance.
    public SavingsAccount(double rate){
        super();
        this.interestRate = rate;
    }


    // Constructs a saving account defining a monthly interest rate and a given balance.
    public SavingsAccount (double rate, double initialBalance){
        super(initialBalance);
        this.interestRate = rate;
    }


    /*
    * GENERAL METHODS
    * */


    // Adds the earned interest to the account balance.
    public void addInterest(){
        super.deposit((super.balance * this.interestRate));
    }


    // Closes the savings account and transfer the balance to another account.
    public void close(BankAccount other){
        other.deposit(super.balance);
        super.balance = 0.0;
    }
}
