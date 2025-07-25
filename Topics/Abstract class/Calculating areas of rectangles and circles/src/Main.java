import java.util.Scanner;

// Define the abstract Shape class with an abstract area() method
abstract class Shape {
    abstract double area();
}

// Implement the Rectangle class that extends Shape
class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

// Implement the Circle class that extends Shape
class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the dimensions of the rectangle
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        // Read the radius of the circle
        double radius = scanner.nextDouble();

        // Create instances of Rectangle and Circle
        Rectangle rectangle = new Rectangle(length, width);
        Circle circle = new Circle(radius);

        // Calculate and print the area of the rectangle
        System.out.println(rectangle.area());

        // Calculate and print the area of the circle
        System.out.println(circle.area());

        scanner.close();
    }
}