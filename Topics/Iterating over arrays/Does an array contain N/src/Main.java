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

        int number = scanner.nextInt();
        boolean isNumberContained = false;

        for (int nums : array) {
            if (nums == number) {
                isNumberContained = true;
                break;
            }
        }

        System.out.println(isNumberContained);

        scanner.close();
    }
}