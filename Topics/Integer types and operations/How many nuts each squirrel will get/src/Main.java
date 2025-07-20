import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt(), k = scanner.nextInt();
        System.out.println(k / n);

        scanner.close();
    }
}