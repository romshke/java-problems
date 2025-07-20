import java.util.Scanner;

// Base class for vehicles
class Vehicle {
    protected int numWheels;

    public Vehicle(int wheels) {
        numWheels = wheels;
    }

    public void printWheels() {
    }
}

// TODO: Create the Bicycle class that extends Vehicle
class Bicycle extends Vehicle {
    public Bicycle() {
        super(2);
    }

    public void printWheels() {
        System.out.printf("A bicycle has %d wheels.", numWheels);
    }
}

// TODO: Create the Motorcycle class that extends Vehicle
class Motorcycle extends Vehicle {
    public Motorcycle() {
        super(2);
    }

    public void printWheels() {
        System.out.printf("A motorcycle has %d wheels.", numWheels);
    }
}

// TODO: Create the Car class that extends Vehicle
class Car extends Vehicle {
    public Car() {
        super(4);
    }

    public void printWheels() {
        System.out.printf("A car has %d wheels.", numWheels);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vehicleType = scanner.nextLine();

        // TODO: Create an instance of the appropriate vehicle class based on vehicleType
        Vehicle vehicle;
        switch (vehicleType) {
            case "bicycle":
                vehicle = new Bicycle();
                break;
            case "motorcycle":
                vehicle = new Motorcycle();
                break;
            case "car":
                vehicle = new Car();
                break;
            default:
                System.out.println("Unknown vehicle type");
                return;
        }
        
        // TODO: Call the printWheels() method on the vehicle instance
        vehicle.printWheels();

        scanner.close();
    }
}