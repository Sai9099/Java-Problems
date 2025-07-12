/*import java.util.Scanner;

class Input
{
    public static void main(String args[])
    {
    Scanner sn = new Scanner(System.in);
    System.out.print("Entern the value of a :");
    int a = sn.nextInt();
    System.out.print("Enter the value of b :");
    int b =  sn.nextInt();


    if(a==b)
    {
        System.out.println("0");
    }
    else if(a>b)
    {
        System.out.println("1");
    }
    else 
    {
        System.out.print("-1");
    }

    }
}*/




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
//case 1
         int result1 =(a==b)? 0 :1;
         System.out.println("result 1 : "+result1);
//case 2

        int result2=(a>b)?0:1;
        System.out.println("result 2: "+result2);

//case 3
        int result3=(b>a)?0:1;
        System.out.println("result 3 :"+result3);


    }
    
    }