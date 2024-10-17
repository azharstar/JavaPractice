package inheritance;

import java.util.Scanner;

// Base Class
class Account {
    int acno;
    String acHolderName;
    String branch;
    Scanner sc;

    // Constructor to initialize the Scanner object
    Account() {
        sc = new Scanner(System.in);
    }

    // Method to input account details
    public void inputAccountDetails() {
        System.out.println("Enter Account Details");
        System.out.println("A/c No: ");
        acno = sc.nextInt();
        System.out.println("A/c Holder Name: ");
        acHolderName = sc.nextLine();
        sc.nextLine(); // Consume the newline character
        System.out.println("Branch Name: ");
        branch = sc.nextLine();
        System.out.println("------------------------");
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("---Account Details---");
        System.out.println("A/c No: " + acno);
        System.out.println("A/c Holder Name: " + acHolderName);
        System.out.println("Branch Name: " + branch);
    }
}

// Derived Class
class SavingsAccount extends Account {
    float balance;

    // Method to initialize balance and input account details
    public void intializeBalance() {
        super.inputAccountDetails();
        System.out.println("Enter Initial Balance: ");
        balance = super.sc.nextFloat();
    }

    // Method to display account information including balance
    public void acInfo() {
        super.displayAccountDetails();
        System.out.println("Available Balance Rs: " + balance);
    }

    // Method to withdraw amount from the account
    public void withdraw() {
        System.out.println("---Withdraw Operation---");
        System.out.println("Enter the Amount");
        float amount = super.sc.nextFloat();
        if (balance - amount > 1000) {
            balance = balance - amount;
            System.out.println("Amount Successfully Withdrawn");
            System.out.println("Available Balance Rs: " + balance);
        } else {
            System.err.println("Insufficient Balance");
            System.err.println("Withdrawal not Possible");
        }
    }

    // Method to deposit amount into the account
    public void deposit() {
        System.out.println("Amount Deposit Operation");
        System.out.println("Enter the Amount: ");
        float amount = super.sc.nextFloat();
        balance = balance + amount;
        System.out.println("Successfully Deposited");
        System.out.println("Available Balance Rs: " + balance);
    }
}

public class AccountExample {
    public static void main(String[] args) {
        // Creating an object of the derived class SavingsAccount
        SavingsAccount sva = new SavingsAccount();
        
        // Initialize balance and input account details
        sva.intializeBalance();
        
        // Deposit amount into the account
        sva.deposit();
        
        // Display account information
        sva.acInfo();
        
        // Withdraw amount from the account
        sva.withdraw();
    }
}
