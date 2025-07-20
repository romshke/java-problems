import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int i = scanner.nextInt(), j = scanner.nextInt();

        for (int[] array : matrix) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}