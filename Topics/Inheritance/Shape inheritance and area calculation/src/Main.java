import java.util.Scanner;

// Define the base class Shape
class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Define the derived class Rectangle
class Rectangle extends Shape {
    private double length, width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the rectangle's name, length, and width from the user
        String name = scanner.nextLine();
        double length = scanner.nextDouble(), width = scanner.nextDouble();

        // Create an instance of the Rectangle class
        Rectangle rectangle = new Rectangle(name, length, width);

        // Print the rectangle's name and area
        System.out.printf("%s%n%.1f", rectangle.getName(), rectangle.area());
    }
}