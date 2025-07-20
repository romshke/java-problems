import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();

        // Your code comes here!
        System.out.printf("%d hours and %d minutes", minutes / 60, minutes % 60);

        scanner.close();
    }
}