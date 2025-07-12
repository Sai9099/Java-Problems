import java.util.Scanner;

class Rectangle
{
    public static void main(String args[])
    {
        Scanner sn=new Scanner(System.in);
        System.out.print("\nEnter the value of lenght :");
        int lenght = sn.nextInt();
        System.out.print("\nEnter the value of breath :");
        int breath = sn.nextInt();

        int Area=lenght*breath;
        int Primeter=2*(lenght+breath);


        System.out.println("Area of Rectangle :"+Area);
        System.out.println("Primeter of rectangle :"+Primeter);

    }
}