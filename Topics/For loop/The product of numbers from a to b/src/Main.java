import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int a = scanner.nextInt(), b = scanner.nextInt(), result = 1;

        for (int i = a; i < b; i++) {
            result *= i;
        }

        System.out.println(result);

        scanner.close();
    }
}