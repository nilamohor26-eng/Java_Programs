import java.util.Scanner;

public class SimpleCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        float a, b;
        int c;

        System.out.print("Enter First Number: ");
        a = sc.nextFloat();

        System.out.print("Enter Second Number: ");
        b = sc.nextFloat();

        while (true)
        {
            System.out.println("\nChoose The Option:");
            System.out.println("1. Sum");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit Loop");

            System.out.print("Enter Your Choice: ");
            c = sc.nextInt();

            switch (c)
            {
                case 1:
                    System.out.println("The Sum is: " + (a + b));
                    break;

                case 2:
                    System.out.println("The Subtraction is: " + (a - b));
                    break;

                case 3:
                    System.out.println("The Multiplication is: " + (a * b));
                    break;

                case 4:
                    if (b != 0)
                    {
                        System.out.println("The Division is: " + (a / b));
                    }
                    else
                    {
                        System.out.println("Division by zero is not possible.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Give Proper Input.");
            }
        }
    }
}