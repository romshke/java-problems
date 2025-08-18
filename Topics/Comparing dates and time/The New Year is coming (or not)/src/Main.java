import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        try (Scanner scanner = new Scanner(System.in)) {
            LocalDate date = LocalDate.parse(scanner.next());
            int days = scanner.nextInt();
            System.out.println(LocalDate.of(date.getYear() + 1, 1, 1).equals(date.plusDays(days)));
        }
    }
}