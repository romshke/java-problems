import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");

        for (int i = numbers.length - 1; i > 0; i--) {
            if (i % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        scanner.close();
    }
}