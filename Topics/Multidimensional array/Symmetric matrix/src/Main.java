import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        boolean isSymmetric = true;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[][] matrix = new int[number][number];

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < number - 1; i++) {
            for (int j = i + 1; j < number; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }

        System.out.println(isSymmetric ? "YES" : "NO");

        scanner.close();
    }
}
