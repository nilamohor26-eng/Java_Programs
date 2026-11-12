import java.util.Scanner;

public class DisplayDetails
{
    public static void main(String[] args)
    {
        String name, roll, course, college;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        name = sc.nextLine();

        System.out.print("Enter Your Roll No.: ");
        roll = sc.nextLine();

        System.out.print("Enter Your Course Name: ");
        course = sc.nextLine();

        System.out.print("Enter Your College: ");
        college = sc.nextLine();

        System.out.println();

        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + roll);
        System.out.println("Course: " + course);
        System.out.println("College: " + college);

        sc.close();
    }
}