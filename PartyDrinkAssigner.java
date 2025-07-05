import java.util.Scanner;

public class PartyDrinkAssigner {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the age as input from the user
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Step 2: Check the age and display the appropriate message
        if (age >= 13 && age <= 19) {
            // If the age is between 13 and 19, it's a teenager
            System.out.println("You are a Teenager.");
            System.out.println("You will be served Badam Milk.");
        } else {
            // If the age is not between 13 and 19, it's an adult
            System.out.println("You are an Adult.");
            System.out.println("You will be served Coke.");
        }

        // Close the scanner
        scanner.close();
    }
}