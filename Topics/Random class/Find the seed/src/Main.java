import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int a = scanner.nextInt(), b = scanner.nextInt(), n = scanner.nextInt(), k = scanner.nextInt();
        Random random = new Random();
        int min = Integer.MAX_VALUE, seed = 0;

        for (int i = a; i <= b; i++) {
            int max = Integer.MIN_VALUE;
            random.setSeed(i);

            for (int j = 0; j < n; j++) {
                max = Math.max(max, random.nextInt(k));
            }

            if (max < min) {
                min = max;
                seed = i;
            }
        }

        System.out.printf("%d%n%d", seed, min);

        scanner.close();
    }
}