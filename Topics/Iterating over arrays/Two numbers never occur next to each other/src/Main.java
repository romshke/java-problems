import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] array = new int[numberOfElements];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt(), m = scanner.nextInt();
        boolean neverOccur = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == n && array[i - 1] == m || array[i] == m && array[i - 1] == n) {
                neverOccur = false;
                break;
            }
        }

        System.out.println(neverOccur);

        scanner.close();
    }
}