import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number, max = Integer.MIN_VALUE;

        do {
            number = scanner.nextInt();
            max = Math.max(number, max);
        } while (number != 0);

        System.out.println(max);

        scanner.close();
    }
}