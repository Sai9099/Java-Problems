/*import java.util.Scanner;
class Swapping

{
    public static void main(String args[])
    {

        //before swapping 
        Scanner sn = new Scanner(System.in);
        System.out.print("\nEnter the value of a :");
        int a = sn.nextInt();
        System.out.print("\nEnter the value of b :");
        int b = sn.nextInt();

        int c=a;
        a=b;
        b=c;
        


    //after the swapping

    System.out.println("The value of a "+a);
    System.out.println("The value of b "+b);

    }
}*/


import java.util.Scanner;


class Swapping
{
    public static void main(String args[])
    {

        Scanner sn = new Scanner(System.in);

        System.out.print("\nEnter the value of a :");
        int a = sn.nextInt();
        System = sn.nextInt(\nEnter the value of b:);
        int b = sn.nextInt();

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("the value of a is :"+a);
        System.out.println("the value of b is :"+b);


    }
}