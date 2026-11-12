import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.print("Enter a number: ");
        a = sc.nextInt();

        if (a % 2 == 0)
        {
            System.out.println("The Number is Even");
        }
        else
        {
            System.out.println("The Number is Odd");
        }

        sc.close();
    }
}