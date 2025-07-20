import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Place your code here
        try {
            int number = sc.nextInt();
            System.out.println(number == 0 ? "zero" : number > 0 ? "positive" : "negative");
        } catch (InputMismatchException ignore) {
            System.out.println("non-integer");
        }

        sc.close();
    }
}