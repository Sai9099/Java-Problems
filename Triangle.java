import java.util.Scanner;

class Triangle
{
public static void main(String args[])
{
    Scanner sn = new Scanner(System.in);
    System.out.print("\nEnter the base :");
    int base = sn.nextInt();
    System.out.print("\nEnter the Hight :");
    int hight = sn.nextInt();

    System.out.println("Area of triangle :"+0.5*(base*hight));

}
}

