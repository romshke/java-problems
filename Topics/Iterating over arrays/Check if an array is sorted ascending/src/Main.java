import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        boolean isSorted = true;

        for (int i = 0, j = -1; i < n; i++, j++) {
            array[i] = scanner.nextInt();

            if (i > 0 && array[i] < array[j]) {
                isSorted = false;
                break;
            }
        }

        System.out.println(isSorted);

        scanner.close();
    }
}