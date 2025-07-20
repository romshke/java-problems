import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        File file = new File(".\\Topics\\Reading files\\The sum of numbers in a file\\dataset_91033.txt");
        int sum = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                sum += scanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        System.out.println(sum);
    }
}
