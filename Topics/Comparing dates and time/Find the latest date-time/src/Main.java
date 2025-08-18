import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Integer.parseInt(scanner.nextLine());
            LocalDateTime latest = LocalDateTime.parse(scanner.nextLine());
            for (int i = 1; i < n; i++) {
                LocalDateTime current = LocalDateTime.parse(scanner.nextLine());
                latest = latest.isAfter(current) ? latest : current;
            }
            System.out.println(latest);
        }
    }
}