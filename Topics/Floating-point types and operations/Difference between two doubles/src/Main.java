import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double num1 = scanner.nextDouble(), num2 = scanner.nextDouble();

        System.out.println(num2 - num1);
        scanner.close();
    }
}