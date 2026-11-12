import java.util.*;

class StaffMember
{
    int staffId;
    String staffName;
    double basicSalary, hra, da, grossSalary;

    void acceptDetails(Scanner sc)
    {
        System.out.print("Enter Staff ID: ");
        staffId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Staff Name: ");
        staffName = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();

        System.out.print("Enter HRA: ");
        hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        da = sc.nextDouble();
    }

    void calculateSalary()
    {
        grossSalary = basicSalary + hra + da;
    }

    void displayDetails()
    {
        System.out.println("\n--- Staff Details ---");
        System.out.println("Staff ID: " + staffId);
        System.out.println("Staff Name: " + staffName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class StaffSalary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        StaffMember staff = new StaffMember();

        staff.acceptDetails(sc);
        staff.calculateSalary();
        staff.displayDetails();

        sc.close();
    }
}