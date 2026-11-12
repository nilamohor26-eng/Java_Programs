import java.util.Scanner;

public class SumOfNaturalNumbers
{
    public static void main(String[] args)
    {
        int x = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Limit: ");
        int n = sc.nextInt();

        if (n <= 0)
        {
            System.out.println("The Input is Invalid");
            sc.close();
            return;
        }

        for (int i = 1; i <= n; i++)
        {
            x += i;
        }

        System.out.println("The Sum of first " + n +
                           " Natural Numbers is: " + x);

        sc.close();
    }
}