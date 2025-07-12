import java.util.Scanner;

class Problem
{
    public static void main(String args[])
    {
         Scanner sn = new Scanner(System.in);
         System.out.print("Enter the value of a :");
         int a = sn.nextInt();
         System.out.print("Enter the value of b :");
         int b = sn.nextInt();


         String result1 =(a>b)? "1" :(a==b)?"0":"-1";
         System.out.println("Result :"+result1);


    }
    
    }