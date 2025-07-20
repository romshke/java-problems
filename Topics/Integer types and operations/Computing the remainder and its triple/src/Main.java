import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        // The first operation goes here
        int first = input % 2;
        System.out.println(first);
        // The second operation goes here
        int second = first * 3;
        System.out.println(second);

        scanner.close();
    }
}