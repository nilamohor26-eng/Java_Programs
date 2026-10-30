class Employee {
    private String name;
    private String department;
    private double salary;

    // Static data member shared by all employees
    static String company = "ABC Company";

    // Constructor
    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Display employee information
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + company);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul", "IT", 30000);
        Employee e2 = new Employee("Priya", "HR", 35000);
        Employee e3 = new Employee("Amit", "Finance", 40000);
        Employee e4 = new Employee("Sneha", "Marketing", 32000);
        Employee e5 = new Employee("Rohan", "IT", 45000);

        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();
    }
}