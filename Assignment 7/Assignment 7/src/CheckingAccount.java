// AUTHOR: BRAYAN QUEVEDO RAMOS
// FILENAME: CheckingAccount.java
// SPECIFICATION: Learning to use polymorphism and inheritance.
// FOR: CS 1400 - ASSIGNMENT #7
// TIME SPENT: 45 minutes.

/**
 * Represents a checking account with additional features like transaction counts and fees.
 * Inherits from the BankAccount class and extends it with checking account-specific features.
 */
public class CheckingAccount extends BankAccount{
    private int transactionCount;
    private final int FREE_TRANSACTIONS = 3;
    private final double TRANSACTION_FEE = 2.0;
    private final double MAINTENANCE_FEE = 10.0;


    /*
    * CONSTRUCTORS
    * */


    // Constructs a checking account with a given balance.
    // The transaction count must be initialized.
    public CheckingAccount(double initialBalance){
        super(initialBalance);
        this.transactionCount = 0;
    }


    /*
    * GENERAL METHODS
    * */


    // Deposits money into the checking account.
    // The transaction count must be incremented by one.
    // If the transaction count is greater than the number of free transactions,
    // it charges (withdraws) the transaction fee.
    public void deposit(double amount){
        super.deposit(amount);
        this.transactionCount++;

        // If the transaction count is greater than the number of free transactions,
        // it charges (withdraws) the transaction fee.
        if (this.transactionCount > this.FREE_TRANSACTIONS){
            super.withdraw(TRANSACTION_FEE);
        }
    }


    // Withdraws money into the checking account.
    // The transaction count must be incremented by one.
    // If the transaction count is greater than the number of free transactions,
    // it charges (withdraws) the transaction fee.
    public void withdraw(double amount){
        super.withdraw(amount);
        this.transactionCount++;

        // If the transaction count is greater than the number of free transactions,
        // it charges (withdraws) the transaction fee.
        if (this.transactionCount > this.FREE_TRANSACTIONS){
            super.withdraw(TRANSACTION_FEE);
        }
    }


    // Charges (withdraws) the maintenance fee.
    // The transaction count must be reset for a new month.
    public void deductMaintenanceFee(){
        super.withdraw(MAINTENANCE_FEE);
        this.transactionCount = 0;
    }


    // Closes the checking account and transfer the balance to another account.
    // Charges (withdraws) the closing fee.
    // Hint: the transaction count must be reset before the other operations.
    public void close(BankAccount other){
        transactionCount = 0;
        super.withdraw(CLOSING_FEE);
        other.deposit(super.balance);
        super.balance = 0.0;
    }
}
