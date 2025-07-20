import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            min = Math.min(min, scanner.nextInt());
        }

        System.out.println(min);

        scanner.close();
    }
}