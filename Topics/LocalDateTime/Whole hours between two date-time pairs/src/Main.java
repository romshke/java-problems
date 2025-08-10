import java.time.LocalDateTime;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.HOURS;

class Main {
    public static void main(String[] args) {
        // put your code here
        try (Scanner scanner = new Scanner(System.in)) {
            LocalDateTime dateTime1 = LocalDateTime.parse(scanner.nextLine());
            LocalDateTime dateTime2 = LocalDateTime.parse(scanner.nextLine());
            System.out.println(Math.abs(dateTime1.until(dateTime2, HOURS)));
        }
    }
}