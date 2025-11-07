import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%.2f", new Square(scanner.nextDouble()).getArea());
    }
}

sealed interface ShapeInterface permits Square {
    double getArea();
}

// Implement the Square class here
non-sealed class Square implements ShapeInterface {
    double side;
    
    Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}