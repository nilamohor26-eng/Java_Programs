import java.util.Scanner;

public class FactorialNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        long factorial = 1;

        if (n < 0)
        {
            System.out.println("Factorial is not defined for negative numbers.");
        }
        else if (n > 20)
        {
            System.out.println("Number is too large to calculate factorial using long.");
        }
        else
        {
            for (int i = 1; i <= n; i++)
            {
                factorial *= i;
            }

            System.out.println("Factorial of " + n + " is: " + factorial);
        }

        sc.close();
    }
}