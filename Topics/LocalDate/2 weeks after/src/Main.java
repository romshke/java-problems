import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println(LocalDate.parse(scanner.nextLine()).plusWeeks(2));
        scanner.close();
    }
}