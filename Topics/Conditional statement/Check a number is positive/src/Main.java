import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = scanner.nextInt();

        System.out.println(number > 0 ? "YES" : "NO");

        scanner.close();
    }
}