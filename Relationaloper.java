import java.util.Scanner;
 class Relationaloper

 {
    public static void main(String args[])
    {
    Scanner sn = new Scanner(System.in);
    System.out.println("\nEnter the value of a :");
    int a =sn.nextInt();
    System.out.println("\nEnter the value of b :");
    int b=sn.nextInt();

    System.out.println("\n==  : "+(a==b));
    System.out.println("\n<: "+(a<b));
    System.out.println("\n>  : "+(a>b));
    System.out.println("\n<=  : "+(a<=b));
    System.out.println("\n>= : "+(a>=b));
    System.out.println("\n!=  : "+(a!=b));
    }
 }

