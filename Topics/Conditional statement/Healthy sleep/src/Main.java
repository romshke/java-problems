import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt(), b = scanner.nextInt(), h = scanner.nextInt();

        System.out.println(h >= a && h <= b ? "Normal" : h < a ? "Deficiency" : "Excess");

        scanner.close();
    }
}