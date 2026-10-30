import java.util.Scanner;

// Interface
interface GrossInterface3 {
    void calculate();
}

// Employee class
class EmployeeDetails3 {
    int emp_no;
    String name;
    String department;

    void getEmployeeDetails(Scanner sc) {
        System.out.print("Enter Employee Number: ");
        emp_no = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Department: ");
        department = sc.nextLine();
    }

    void displayEmployeeDetails() {
        System.out.println("Employee Number: " + emp_no);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

// Salary class
class EmployeeSalary3 extends EmployeeDetails3
        implements GrossInterface3 {

    double basic_pay, DA, HRA, gross_salary;

    void getSalaryDetails(Scanner sc) {
        System.out.print("Enter Basic Pay: ");
        basic_pay = sc.nextDouble();
    }

    @Override
    public void calculate() {
        DA = basic_pay * 0.10;
        HRA = basic_pay * 0.20;
        gross_salary = basic_pay + DA + HRA;
    }

    void displaySalaryDetails() {
        System.out.println("Basic Pay: " + basic_pay);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("Gross Salary: " + gross_salary);
    }
}

// Main class
public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EmployeeSalary3 s = new EmployeeSalary3();

        s.getEmployeeDetails(sc);
        s.getSalaryDetails(sc);
        s.calculate();

        System.out.println("\n--- Employee Details ---");
        s.displayEmployeeDetails();
        s.displaySalaryDetails();

        sc.close();
    }
}