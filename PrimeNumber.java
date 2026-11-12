import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        int c = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                c++;
            }
        }

        if (n > 1 && c == 2)
        {
            System.out.println(n + " is a Prime Number");
        }
        else
        {
            System.out.println(n + " is not a Prime Number");
        }

        sc.close();
    }
}