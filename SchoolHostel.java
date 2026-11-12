// 1.	Create an interface Department containing attributes deptName and deptHead. It also has abstract methods for printing the attributes. Create a class hostel containing hostelName, hostelLocation and numberofRooms. The class contains methods for getting and printing the attributes. Then write Student class extending the Hostel class and implementing the Department interface. This class contains attributes studentName, regdNo, electiveSubject and avgMarks. Write suitable getData and printData methods for this class. Also implement the abstract methods of the Department interface. Write a driver class to test the Student class. The program should be menu driven containing the options: i) Admit new student ii) Migrate a student iii) Display details For the second option a search is to be made on the basis of the entered registration number

import java.util.ArrayList;
import java.util.Scanner;

// Department Interface
interface department {
    void printDeptName();
    void printDeptHead();
}

// Hostel Class
class Hostel {
    String hostelName;
    String hostelLocation;
    int numberofRooms;

    Scanner sc = new Scanner(System.in);

    void getHostelData() {
        System.out.print("Enter Hostel Name: ");
        hostelName = sc.nextLine();

        System.out.print("Enter Hostel Location: ");
        hostelLocation = sc.nextLine();

        System.out.print("Enter Number of Rooms: ");
        numberofRooms = sc.nextInt();
        sc.nextLine();
    }

    void printHostelData() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberofRooms);
    }
}

// Student Class
class Student extends Hostel implements department {

    String studentName;
    int regdNo;
    String electiveSubject;
    double avgMarks;

    String deptName;
    String deptHead;

    void getData() {
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Registration Number: ");
        regdNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Elective Subject: ");
        electiveSubject = sc.nextLine();

        System.out.print("Enter Average Marks: ");
        avgMarks = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Department Name: ");
        deptName = sc.nextLine();

        System.out.print("Enter Department Head: ");
        deptHead = sc.nextLine();

        getHostelData();
    }

    // Implementing Department Interface Methods
    @Override
    public void printDeptName() {
        System.out.println("Department Name: " + deptName);
    }

    @Override
    public void printDeptHead() {
        System.out.println("Department Head: " + deptHead);
    }

    // Printing Student Details
    void printData() {
        System.out.println("\n----- STUDENT DETAILS -----");

        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);

        printDeptName();
        printDeptHead();
        printHostelData();
    }
}

// Driver Class
public class SchoolHostel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Admit New Student");
            System.out.println("2. Migrate a Student");
            System.out.println("3. Display Details");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    Student s = new Student();
                    s.getData();
                    students.add(s);

                    System.out.println("Student admitted successfully!");
                    break;

                case 2:
                    System.out.print("Enter Registration Number: ");
                    int reg = sc.nextInt();
                    sc.nextLine();

                    boolean found = false;

                    for (Student st : students) {
                        if (st.regdNo == reg) {

                            System.out.println("Student Found!");
                            System.out.println("Enter New Hostel Details:");

                            st.getHostelData();

                            System.out.println("Student migrated successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 3:
                    if (students.isEmpty()) {
                        System.out.println("No student records available.");
                    } else {
                        for (Student st : students) {
                            st.printData();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}