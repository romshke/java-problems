import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = scanner.nextInt(), num2 = scanner.nextInt(), num3 = scanner.nextInt();

        System.out.println(num1 >= num2 && num1 <= num3 || num1 <= num2 && num1 >= num3);

        scanner.close();
    }
}