import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();
        System.out.println((c - b) / a);
        scanner.close();
    }
}