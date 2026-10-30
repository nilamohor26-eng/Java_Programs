import java.util.Scanner;

class Employee_2_Data {
    int emp_no;
    String name;
    String department;
    double basic_pay, DA, HRA, gross_salary;

    // Constructor
    Employee_2_Data(int emp_no, String name, String department, double basic_pay) {
        this.emp_no = emp_no;
        this.name = name;
        this.department = department;
        this.basic_pay = basic_pay;

        DA = basic_pay * 0.10;
        HRA = basic_pay * 0.20;
        gross_salary = basic_pay + DA + HRA;
    }

    // Display employee details
    void display() {
        System.out.println("Employee Number: " + emp_no);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Basic Pay: " + basic_pay);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("Gross Salary: " + gross_salary);
    }
}

public class Employee_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee_2_Data[] emp = new Employee_2_Data[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of employee " + (i + 1) + ":");

            System.out.print("Employee Number: ");
            int emp_no = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Department: ");
            String department = sc.nextLine();

            System.out.print("Basic Pay: ");
            double basic_pay = sc.nextDouble();
            sc.nextLine();

            emp[i] = new Employee_2_Data(emp_no, name, department, basic_pay);
        }

        int highest = 0;

        for (int i = 1; i < n; i++) {
            if (emp[i].gross_salary > emp[highest].gross_salary) {
                highest = i;
            }
        }

        System.out.println("\nEmployee Having Highest Gross Salary:");
        emp[highest].display();

        sc.close();
    }
}