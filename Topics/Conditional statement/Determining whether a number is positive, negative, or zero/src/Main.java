import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Your code here
        System.out.println(number == 0 ? "Zero" : number > 0 ? "Positive" : "Negative");

        scanner.close();
    }
}