import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDate date = LocalDate.parse(scanner.next());
        System.out.printf("%s %s", date.getDayOfYear(), date.getDayOfMonth());
        scanner.close();
    }
}