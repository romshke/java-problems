import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble(), d = scanner.nextDouble();
        System.out.println(a * 10.5 + b * 4.4 + (c + d) / 2.2);
        scanner.close();
    }
}