import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println(LocalDate.ofYearDay(scanner.nextInt(), scanner.nextInt()).getDayOfMonth() == 1);
        scanner.close();
    }
}