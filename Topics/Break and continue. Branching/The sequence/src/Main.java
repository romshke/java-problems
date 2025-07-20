import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int n = scanner.nextInt(), number = 1, count = number;

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", number);
            count--;
            if (count == 0) {
                number++;
                count = number;
            }
        }

        scanner.close();
    }
}