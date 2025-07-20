import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), maxProduct = 0;
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            maxProduct = Math.max(maxProduct, numbers[i] * numbers[i + 1]);
        }

        System.out.println(maxProduct);

        scanner.close();
    }
}