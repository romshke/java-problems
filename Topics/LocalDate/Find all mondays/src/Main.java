import java.time.LocalDate;
import java.util.Scanner;

import static java.time.DayOfWeek.MONDAY;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt(), month = scanner.nextInt();
        LocalDate date = LocalDate.of(year, month, 1);

        while (date.getDayOfWeek() != MONDAY) {
            date = date.plusDays(1);
        }

        while (date.getMonthValue() == month) {
            System.out.println(date);
            date = date.plusWeeks(1);
        }

        scanner.close();
    }
}