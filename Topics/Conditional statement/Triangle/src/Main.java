import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();

        System.out.println(a + b > c && a + c > b && b + c > a ? "YES" : "NO");

        scanner.close();
    }
}