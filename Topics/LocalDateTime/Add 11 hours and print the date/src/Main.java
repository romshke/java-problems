import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(LocalDateTime.parse(scanner.nextLine()).plusHours(11).format(DateTimeFormatter.ISO_DATE));
        }
    }
}