import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0, n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }

        System.out.println(sum);

        scanner.close();
    }
}