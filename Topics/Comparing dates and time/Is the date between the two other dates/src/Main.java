import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        try (Scanner scanner = new Scanner(System.in)) {
            LocalDate x = LocalDate.parse(scanner.next()), m = LocalDate.parse(scanner.next()), n = LocalDate.parse(scanner.next());
            System.out.println(x.isAfter(m) && x.isBefore(n) || x.isAfter(n) && x.isBefore(m));
        }
    }
}