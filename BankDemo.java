// Write a program to implement the Multiple Inheritance kind of framework (Bank Interface, Customer & Account classes).
import java.util.Scanner;

// Bank Interface
interface Bank {
    void displayBank();
}

// Customer class
class Customer {
    String name;
    int customerId;

    void getCustomerDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();

        System.out.print("Enter Customer ID: ");
        customerId = sc.nextInt();
    }
}

// Account class implements Bank interface
class Account extends Customer implements Bank {
    int accountNumber;
    double balance;

    void getAccountDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();

        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    public void displayBank() {
        System.out.println("Bank Name: SBI");
    }

    void displayDetails() {
        displayBank();
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Main class
public class BankDemo {
    public static void main(String[] args) {
        Account a = new Account();

        a.getCustomerDetails();
        a.getAccountDetails();
        a.displayDetails();
    }
}