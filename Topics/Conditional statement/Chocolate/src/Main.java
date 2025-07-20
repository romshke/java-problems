import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int n = scanner.nextInt(), m = scanner.nextInt(), k = scanner.nextInt();

        System.out.println(k % n == 0 && m >= k / n || k % m == 0 && n >= k / m ? "YES" : "NO");

        scanner.close();
    }
}