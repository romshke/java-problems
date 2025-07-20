import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double ρ = scanner.nextDouble(), h = scanner.nextDouble(), g = 9.8;
        System.out.println(ρ * g * h);
        scanner.close();
    }
}