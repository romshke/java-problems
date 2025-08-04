import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int[] days = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

        for (int day : days) {
            System.out.println(LocalDate.ofYearDay(year, day));
        }

        scanner.close();
    }
}