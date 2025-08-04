import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDate date = LocalDate.of(scanner.nextInt(), scanner.nextInt(), 1);
        System.out.printf("%s %s", date, date.plusDays(date.lengthOfMonth() - 1));
        scanner.close();
    }
}