import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int a = scanner.nextInt(), b = scanner.nextInt(), n = scanner.nextInt(), result = 0;

        for (int i = a; i <= b; i++) {
            result += (i % n == 0) ? 1 : 0;
        }

        System.out.println(result);

        scanner.close();
    }
}