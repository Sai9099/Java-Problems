import java.util.Scanner;

class Cuboid

{
    public static void main(String args[]){

        Scanner sn = new Scanner(System.in);
        
        System.out.print("\nEnter the lenght :");
        int lenght =sn.nextInt();
        System.out.print("\nEnter the hight:");
        int hight =sn.nextInt();
        System.out.print("\nEnter the width :");
        int width =sn.nextInt();

        int volume = lenght*width*hight;

        System.out.println("\nVolume of the cuboid :"+volume);
        
    }

}