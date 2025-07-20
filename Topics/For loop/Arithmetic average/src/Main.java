import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int a = scanner.nextInt(), b = scanner.nextInt(), sum = 0, count = 0;

        for (int i = a; i <= b; i++) {
            sum += i % 3 == 0 ? i : 0;
            count += i % 3 == 0 ? 1 : 0;
        }

        System.out.println((double) sum / count);

        scanner.close();
    }
}