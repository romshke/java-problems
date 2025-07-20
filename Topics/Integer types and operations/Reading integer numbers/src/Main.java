import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int[] numbers = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}