// Both interfaces 'Shape' and 'Colorable' need to be declared here
// Remember to add the default methods 'name()' and 'color()'


// Implement the interfaces in the 'Circle' class here
// Make sure to override the 'name()' method


// Create the 'ColoredCircle' class that extends 'Circle' and overrides 'color()'


import java.util.Scanner;

// Finally, create a method that takes the string input and returns the name and color of the respective object
public class Main {

    // Add your method here
    interface Shape {
        default String name() {
            return "Generic Shape";
        }
    }

    interface Colorable {
        default String color() {
            return "No Color";
        }
    }

    static class Circle implements Shape, Colorable {
        @Override
        public String name() {
            return "Circle";
        }
    }

    static class ColoredCircle extends Circle {
        @Override
        public String color() {
            return "Red";
        }
    }

    public static void main(String[] args) {
        // Use this main method for testing your implementation
        Scanner scanner = new Scanner(System.in);
        String object = scanner.nextLine();

        switch (object) {
            case "Circle":
                Circle circle = new Circle();
                System.out.printf("%s%n%s", circle.name(), circle.color());
                break;
            case "ColoredCircle":
                ColoredCircle coloredCircle = new ColoredCircle();
                System.out.printf("%s%n%s", coloredCircle.name(), coloredCircle.color());
                break;
        }

        scanner.close();
    }
}