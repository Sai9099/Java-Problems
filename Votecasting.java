import java.util.Scanner;

class Votecasting

{
    public static void main(String args[])
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the age :");
        int age = sn.nextInt();

        if(age>=18)
        {
            System.out.println("Aligeble for voting");
        }
        else
        {
            System.out.println("Not Aligeble for voting");
        }



    }
}