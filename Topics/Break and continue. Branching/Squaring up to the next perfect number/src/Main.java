import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        // Your code to find the first perfect square greater than N goes here
        // Use a loop and the break statement when you find the answer
        int number = N + 1;

        while (Math.sqrt(number) % 1 != 0) {
            number++;
        }

        // Print the result here
        System.out.println(number);

        scanner.close();
    }
}