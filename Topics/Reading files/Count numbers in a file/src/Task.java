import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        File file = new File(".\\Topics\\Reading files\\Count numbers in a file\\dataset_91022.txt");
        int count = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                int number = scanner.nextInt();
                count += number >= 9999 ? 1 : 0;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        System.out.println(count);
    }
}
