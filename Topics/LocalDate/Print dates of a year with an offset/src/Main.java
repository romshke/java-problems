import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDate date = LocalDate.parse(scanner.next());
        int currentYear = date.getYear();
        int offset = scanner.nextInt();

        while (date.getYear() == currentYear) {
            System.out.println(date);
            date = date.plusDays(offset);
        }

        scanner.close();
    }
}