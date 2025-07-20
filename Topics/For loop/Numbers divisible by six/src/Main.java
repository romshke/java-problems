import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberOfElements = scanner.nextInt();
        // start coding here
        for (int i = 0; i < numberOfElements; i++) {
            int number = scanner.nextInt();
            sum += number % 6 == 0 ? number : 0;
        }

        System.out.println(sum);
    }
}