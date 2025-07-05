import java.util.Scanner;

class Greaternum
{
    public static void main(String args[])
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("\nEnter the value of num1:");
        int num1 = sn.nextInt();
        System.out.print("\nEnter the value of num2:");
        int num2 = sn.nextInt();

        if(num1>num2)
        {
            System.out.println(num1+" is greater ");
        }
        else
        {
            System.out.println(num2+" is greater");
        }



    }
}