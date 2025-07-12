import java.util.Scanner;

class Room {
    
  
    int roomNo;
    String roomType;
    double roomArea;
    boolean acMachine;

    
    public void setData() {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter Room Number: ");
        roomNo = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Enter Room Type (e.g., Single, Double, Suite): ");
        roomType = scanner.nextLine();

        System.out.print("Enter Room Area in square meters: ");
        roomArea = scanner.nextDouble();

        System.out.print("Does the room have an AC machine? (true/false): ");
        acMachine = scanner.nextBoolean();
    }

   
    public void displayData() {
        System.out.println("\nRoom Details:");
        System.out.println("Room Number: " + roomNo);
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Area: " + roomArea + " sq meters");
        System.out.println("AC Machine: " + (acMachine ? "Yes" : "No"));
    }
}

public class RoomBooking {
    public static void main(String[] args) {
       
        Room room = new Room();

        
        room.setData();

        
        room.displayData();
    }
}