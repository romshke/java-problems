import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Implement the Vehicle class
        class Vehicle {
            private final String brand;
            private final int year;

            public Vehicle(String brand, int year) {
                this.brand = brand;
                this.year = year;
            }

            public String getBrand() {
                return brand;
            }

            public int getYear() {
                return year;
            }
        }

        // TODO: Implement the Car class (extends Vehicle)
        class Car extends Vehicle {
            private final int numDoors;

            public Car(String brand, int year, int numDoors) {
                super(brand, year);
                this.numDoors = numDoors;
            }

            public int getNumDoors() {
                return numDoors;
            }

            public void displayInfo() {
                System.out.printf("%s (%d)%nNumber of doors: %d", getBrand(), getYear(), getNumDoors());
            }
        }

        // TODO: Implement the Motorcycle class (extends Vehicle)
        class Motorcycle extends Vehicle {
            private final boolean hasSidecar;

            public Motorcycle(String brand, int year, boolean hasSidecar) {
                super(brand, year);
                this.hasSidecar = hasSidecar;
            }

            public boolean isHasSidecar() {
                return hasSidecar;
            }

            public void displayInfo() {
                System.out.printf("%s (%d)%nHas sidecar: %b", getBrand(), getYear(), isHasSidecar());
            }
        }

        // Read input and create appropriate vehicle object
        String vehicleType = scanner.nextLine();
        String brand = scanner.nextLine();
        int year = Integer.parseInt(scanner.nextLine());

        if (vehicleType.equals("Car")) {
            int numDoors = Integer.parseInt(scanner.nextLine());
            // TODO: Create a Car object and call displayInfo()
            Car car = new Car(brand, year, numDoors);
            car.displayInfo();
        } else if (vehicleType.equals("Motorcycle")) {
            boolean hasSidecar = Boolean.parseBoolean(scanner.nextLine());
            // TODO: Create a Motorcycle object and call displayInfo()
            Motorcycle motorcycle = new Motorcycle(brand, year, hasSidecar);
            motorcycle.displayInfo();
        }

        scanner.close();
    }
}