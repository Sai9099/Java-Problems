import java.util.Scanner;

class RelationalOper
{
    public static void main(String args[])
    {
    Scanner sn = new Scanner(System.in);
    System.out.println("\nENter the value of A :");
    int a = sn.nextInt();
    System.out.println("\nENter the value of B:");
    int b = sn.nextInt();

    System.out.print("\n==:"+(a==b));
    System.out.print("\n<:"+(a<b));
    System.out.print("\n>:"+(a>b));
    System.out.print("\n<=:"+(a>=b));
    System.out.print("\n<=:"+(a<=b));
    System.out.print("\n!=:"+(a!=b));
        }
   
}
 
 
