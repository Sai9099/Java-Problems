import java.util.Scanner;

class LeapYear
{
    public static void main(String args[])
    {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter the Year :");
        int Year = sn.nextInt();

        if(Year%4==0)
        {
            System.out.println(Year+" is a leap year");
        }
        else
        {
            System.out.println(Year+" is not a leap year");
        }





    }
}