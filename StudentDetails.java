import java.util.*;

class Student
{
    int roll;
    String name;
    double marks;

    void acceptDetails()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter marks: ");
        marks = sc.nextDouble();
    }

    String calculateGrade()
    {
        if (marks >= 90)
            return "A+";
        else if (marks >= 80)
            return "A";
        else if (marks >= 70)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 50)
            return "D";
        else
            return "F";
    }

    void displayDetails()
    {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll Number: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class StudentDetails
{
    public static void main(String[] args)
    {
        Student student = new Student();

        student.acceptDetails();
        student.displayDetails();
    }
}
