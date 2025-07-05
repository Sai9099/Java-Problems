import java.util.Scanner;

public class DeliveryFeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter package weight (in kg): ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter delivery distance (in km): ");
        double distance = scanner.nextDouble();
        
        
        if (weight <= 0 || distance <= 0) {
            System.out.println("Error: Weight and Distance must be greater than 0.");
            return;
        }
        
        double baseRate = 5.0;
        double totalCharge = baseRate * weight * distance;
        
       
        if (weight > 10) {
            totalCharge += 20; 
        }
        
        System.out.println("The total delivery charge is: $" + totalCharge);
        
        scanner.close();
    }
}
