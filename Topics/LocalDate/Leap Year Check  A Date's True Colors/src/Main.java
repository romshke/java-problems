import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Add `LocalDate` object creation here
        LocalDate date = LocalDate.parse(scanner.nextLine());

        // Check if the year from the date is a leap year
        boolean isLeapYear = date.isLeapYear();

        // Print `true` or `false` based on the result
        System.out.println(isLeapYear);

        scanner.close();
    }
}