import java.util.*;

class BankAccount
{
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
        else
        {
            System.out.println("Enter a valid deposit amount.");
        }
    }

    void withdraw(double amount)
    {
        if (amount <= 0)
        {
            System.out.println("Enter a valid withdrawal amount.");
        }
        else if (amount > balance)
        {
            System.out.println("Insufficient Balance.");
        }
        else
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void displayDetails()
    {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accountNumber, name, balance);

        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.print("Enter Withdrawal Amount: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        account.displayDetails();

        sc.close();
    }
}