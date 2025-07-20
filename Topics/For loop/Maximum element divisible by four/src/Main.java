import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int n = scanner.nextInt(), result = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            result = number % 4 == 0 && number > result ? number : result;
        }

        System.out.println(result);

        scanner.close();
    }
}