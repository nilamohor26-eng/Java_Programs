import java.util.Scanner;

public class Arithmetic
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        int sum = a + b;
        int sub = a - b;
        int multi = a * b;

        System.out.println("Sum = " + sum);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + multi);

        if (b != 0)
        {
            int divide = a / b;
            System.out.println("Division = " + divide);
        }
        else
        {
            System.out.println("Division is not possible");
        }

        sc.close();
    }
}