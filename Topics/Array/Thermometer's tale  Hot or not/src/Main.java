import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Declare and initialize the array
        double[] temperatures = new double[n];

        // Read temperature values
        for (int i = 0; i < n; i++) {
            temperatures[i] = scanner.nextDouble();
        }

        // Calculate average, highest, and count above 30.0°C
        double average = 0.0;
        double highest = temperatures[0];
        int countAbove30 = 0;

        for (double temperature : temperatures) {
            average += temperature;
            if (temperature > highest) {
                highest = temperature;
            }
            if (temperature > 30.0) {
                countAbove30++;
            }
        }

        average /= n;

        // Print results
        System.out.printf("Average: %.1f%n", average);
        System.out.printf("Highest: %.1f%n", highest);
        System.out.printf("Above 30.0°C: %d%n", countAbove30);

        scanner.close();
    }
}