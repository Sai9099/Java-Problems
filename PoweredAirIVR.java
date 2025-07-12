import java.util.Scanner;

public class PoweredAirIVR {

    // Method to display main menu
    public static void displayMainMenu() {
        System.out.println("Welcome to Powered Air service. What would you like to do?");
        System.out.println("a. Know my balance");
        System.out.println("b. Know my validity date");
        System.out.println("c. Know number of free calls available");
        System.out.println("d. More");
        System.out.print("Please select an option (a/b/c/d): ");
    }

    // Method to display the 'More' menu
    public static void displayMoreMenu() {
        System.out.println("1. Prepaid Bill Request");
        System.out.println("2. Customer Preferences");
        System.out.println("3. GPRS activation");
        System.out.println("4. Special Message Offers");
        System.out.println("5. Special GPRS Offers");
        System.out.println("6. 3G Activation");
        System.out.println("7. Go back to Previous menu");
        System.out.print("Please select an option (1-7): ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice;

        // Display main menu and ask for user input
        while (true) {
            displayMainMenu();
            userChoice = scanner.nextLine();

            // Handle the main menu choices
            switch (userChoice) {
                case "a":
                    System.out.println("Your current balance is $50.");
                    break;
                case "b":
                    System.out.println("Your validity date is 31st January 2025.");
                    break;
                case "c":
                    System.out.println("You have 10 free calls remaining.");
                    break;
                case "d":
                    // Display the 'More' menu
                    while (true) {
                        displayMoreMenu();
                        String moreChoice = scanner.nextLine();

                        // Handle the 'More' menu choices
                        switch (moreChoice) {
                            case "1":
                                System.out.println("Prepaid Bill Request: Your bill request has been processed.");
                                break;
                            case "2":
                                System.out.println("Customer Preferences: Your preferences are updated.");
                                break;
                            case "3":
                                System.out.println("GPRS activation: Your GPRS service is activated.");
                                break;
                            case "4":
                                System.out.println("Special Message Offers: You have 3 special message offers available.");
                                break;
                            case "5":
                                System.out.println("Special GPRS Offers: You have 2 special GPRS offers available.");
                                break;
                            case "6":
                                System.out.println("3G Activation: Your 3G service is activated.");
                                break;
                            case "7":
                                // Go back to the main menu
                                System.out.println("Going back to the main menu...");
                                break;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                                continue;
                        }
                        if (moreChoice.equals("7")) {
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option (a/b/c/d).");
            }

            // Ask the user if they want to perform another operation
            System.out.print("Do you want to perform another operation? (yes/no): ");
            String continueChoice = scanner.nextLine();
            if (continueChoice.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Powered Air service. Goodbye!");
                break;
            }
        }

        
    }
}