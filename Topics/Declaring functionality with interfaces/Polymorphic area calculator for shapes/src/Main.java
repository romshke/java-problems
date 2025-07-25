import java.util.Scanner;

interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        // TODO: Implement area calculation for rectangle
        return length * width;
    }
}

class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        // TODO: Implement area calculation for circle
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shapeType = scanner.nextLine();

        Shape shape;

        if (shapeType.equalsIgnoreCase("rectangle")) {
            double length = scanner.nextDouble();
            double width = scanner.nextDouble();
            shape = new Rectangle(length, width);
        } else if (shapeType.equalsIgnoreCase("circle")) {
            double radius = scanner.nextDouble();
            shape = new Circle(radius);
        } else {
            System.out.println("Invalid shape type!");
            return;
        }

        double area = shape.calculateArea();
        System.out.printf("%.2f\n", area);

        scanner.close();
    }
}