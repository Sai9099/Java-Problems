import java.util.Scanner;

class Naturalnum

{
    public static void main(String args[]){

      Scanner sn = new Scanner(System.in);
        
            System.out.print("\nEnter the value of n :");
            int n = sn.nextInt();

            int sum = (n*(n+1))/2;    

            System.out.println("Sum of n natural numbers is :"+sum);



    }



}