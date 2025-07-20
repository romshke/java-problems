import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        File file = new File(".\\Topics\\Reading files\\Count even numbers\\dataset_91065.txt");
        int numberOfEvenNumbers = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                int number = scanner.nextInt();

                if (number == 0) {
                    break;
                }

                numberOfEvenNumbers += number % 2 == 0 ? 1 : 0;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        System.out.println(numberOfEvenNumbers);
    }
}
