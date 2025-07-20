import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {
        steps = steps % arr.length;
        int[] temp = new int[arr.length];

        for (int i = arr.length - steps, j = 0; i < arr.length; i++, j++) {
            temp[j] = arr[i];
        }

        for (int i = steps, j = 0; i < arr.length; i++, j++) {
            temp[i] = arr[j];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}