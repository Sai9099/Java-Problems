import java.util.Scanner;
class Nnaturalnum
{
    public static void main(String args[])
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("\nEnter the value of n : ");
        int n = sn.nextInt();

    int i,sum=0;
    for(i=1;i<=n;i++)
    {
        sum+=i;
    }
        System.out.println("sum of n natural numbers :"+sum);
    }
}