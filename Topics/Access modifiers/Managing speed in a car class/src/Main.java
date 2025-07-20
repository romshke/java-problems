import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instantiate a Car object here and use the drive method
        // Use displaySpeed to print the current speed
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();
        car.drive(scanner.nextInt());
        car.displaySpeed();
        scanner.close();
    }
}

class Car {
    private int speed;

    public Car() {
        // Initialize the speed field here
        this.speed = 0;
    }

    public void drive(int increase) {
        // Write a method that takes an integer as argument 
        // and adds it to the 'speed'.
        // Use a condition to check if the speed becomes greater than 200
        // if so, cap the speed at 200
        speed += speed + increase > 200 ? 200 - speed : increase;
    }

    public void displaySpeed() {
        // Write a method that prints the current speed
        System.out.println(speed);
    }
}