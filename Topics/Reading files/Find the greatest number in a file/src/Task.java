import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        File file = new File(".\\Topics\\Reading files\\Find the greatest number in a file\\dataset_91007.txt");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number > max) {
                    max = number;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        System.out.println(max);
    }
}
