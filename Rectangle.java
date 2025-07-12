import java.util.Scanner;

// Class to represent a rectangle
class Shape {

    // Attributes: length and width
    double length;
    double width;

    // Method to read the length and width from the user
    public void readAttributes() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Main class
public class Rectangle {
    public static void main(String[] args) {
        // Create an object of Shape
        Shape rectangle = new Shape();

        // Read length and width from the user
        rectangle.readAttributes();

        // Calculate and display the area and perimeter
        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}
