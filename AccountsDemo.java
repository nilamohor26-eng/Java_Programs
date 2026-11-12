// Create an abstract class Accounts with the following details: Data Members: (a) Balance (b) accountNumber (c) accountHoldersName (d) address; Methods: (a) withdrawl()- abstract (b) deposit()- abstract (c) display() to show the balance of the account number Create a subclass of this class SavingsAccount and add the following details: Data Members: (a) rateOfInterest Methods: (a)	calculateAmount() Write the Java program to implement this classes

import java.util.Scanner;

// Abstract class
abstract class Accounts {
    double balance;
    int accountNumber;
    String accountHoldersName;
    String address;

    Scanner sc = new Scanner(System.in);

    abstract void withdrawl();
    abstract void deposit();

    void display() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHoldersName);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }
}

// Subclass
class SavingsAccount extends Accounts {
    double rateOfInterest;

    void getDetails() {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        accountHoldersName = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();

        System.out.print("Enter Rate of Interest (%): ");
        rateOfInterest = sc.nextDouble();
    }

    void withdrawl() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        balance = balance + amount;
        System.out.println("Deposit successful.");
    }

    void calculateAmount() {
        double interest = balance * rateOfInterest / 100;
        double totalAmount = balance + interest;

        System.out.println("Interest: " + interest);
        System.out.println("Total Amount: " + totalAmount);
    }
}

// Main class
public class AccountsDemo {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();

        sa.getDetails();
        sa.deposit();
        sa.withdrawl();
        sa.display();
        sa.calculateAmount();
    }
}