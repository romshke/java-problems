import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int n = scanner.nextInt(), max = Integer.MIN_VALUE;

        while (n > 0) {
            int number = scanner.nextInt();
            max = number % 4 == 0 && number > max ? number : max;
            n--;
        }

        System.out.println(max);

        scanner.close();
    }
}