import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter HELLO:");
        String hello = sc.next();  
        System.out.println(hello);

        
        System.out.println("Enter HELLO WORLD:");
        sc.nextLine(); 
        String helloWorld = sc.nextLine();  
        System.out.println(helloWorld);
        
    }
}
