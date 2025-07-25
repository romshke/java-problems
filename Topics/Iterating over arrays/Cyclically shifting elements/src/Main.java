import java.util.Scanner;

class Main {
    private static void rotate(int[] arr) {
        int[] temp = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i < arr.length; i++, j++) {
            temp[j] = arr[i];
        }

        for (int i = 1, j = 0; i < arr.length; i++, j++) {
            temp[i] = arr[j];
        }

        System.arraycopy(temp, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        rotate(a);

        for (int i : a) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}