import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] array = new int[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt(), sum = 0;

        for (int i : array) {
            sum += i > n ? i : 0;
        }

        System.out.println(sum);

        scanner.close();
    }
}