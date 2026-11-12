import java.util.Scanner;

public class LargestNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Enter First Number: ");
        a = sc.nextInt();

        System.out.println("Enter Second Number: ");
        b = sc.nextInt();

        System.out.println("Enter Third Number: ");
        c = sc.nextInt();

        if (a >= b && a >= c)
        {
            System.out.println("Largest Number: " + a);
        }
        else if (b >= a && b >= c)
        {
            System.out.println("Largest Number: " + b);
        }
        else
        {
            System.out.println("Largest Number: " + c);
        }

        sc.close();
    }
}