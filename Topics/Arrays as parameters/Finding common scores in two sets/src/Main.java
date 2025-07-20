import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take two integers n and m – the number of scores in each set
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Take two arrays a and b – the score sets
        int[] a = new int[n];
        int[] b = new int[m];

        for(int i=0; i<n; i++) {
            a[i] = scanner.nextInt();
        }

        for(int i=0; i<m; i++) {
            b[i] = scanner.nextInt();
        }

        int commonScores = findCommonScores(a, b);

        // Print out the number of common scores
        System.out.println(commonScores);

        scanner.close();
    }

    // Declare method findCommonScores here
    // This method takes two arrays as parameters and returns an integer
    // This method should contain the logic to find common elements in two arrays
    static int findCommonScores(int[] a, int[] b) {
        ArrayList<Integer> commonScores = new ArrayList<>();

        for (int scoreA : a) {
            for (int scoreB : b) {
                if (scoreA == scoreB && !commonScores.contains(scoreA)) {
                    commonScores.add(scoreA);
                }
            }
        }

        return commonScores.size();
    }
}