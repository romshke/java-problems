import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), triplesCount = 0;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

            if (i > 1) {
                triplesCount += array[i - 2] == array[i - 1] - 1 && array[i - 1] == array[i] - 1 ? 1 : 0;
            }
        }

        System.out.println(triplesCount);

        scanner.close();
    }
}