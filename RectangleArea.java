import java.util.*;

class Rectangle
{
    double length;
    double breadth;

    void acceptDetails()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }

    double calculateArea()
    {
        return length * breadth;
    }

    double calculatePerimeter()
    {
        return 2 * (length + breadth);
    }

    void displayDetails()
    {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

public class RectangleArea
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();

        r.acceptDetails();
        r.displayDetails();
    }
}