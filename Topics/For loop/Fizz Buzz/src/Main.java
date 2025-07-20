import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int start = scanner.nextInt(), end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println(i % 5 == 0 && i % 3 == 0 ? "FizzBuzz" : i % 5 == 0 ? "Buzz" : i % 3 == 0 ? "Fizz" : i);
        }

        scanner.close();
    }
}