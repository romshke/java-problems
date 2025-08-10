import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        try (Scanner scanner = new Scanner(System.in)) {
            LocalDateTime dateTime = LocalDateTime.parse(scanner.nextLine()).plusMinutes(scanner.nextInt());
            System.out.println(dateTime.format(DateTimeFormatter.ofPattern(dateTime.getSecond() == 0 ? "yyyy D HH:mm" : "yyyy D HH:mm:ss")));
        }
    }
}