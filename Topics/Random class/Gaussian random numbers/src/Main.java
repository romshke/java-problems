import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int k = scanner.nextInt(), n = scanner.nextInt();
        double m = scanner.nextDouble();
        boolean isFound = false;
        Random random = new Random(k);
        int i = 0;

        while (!isFound) {
            random.setSeed(k + i);

            for (int j = 0; j < n; j++) {
                double gaussianNumber = random.nextGaussian();

                if (gaussianNumber > m) {
                    break;
                }

                if (j == n - 1) {
                    System.out.println(k + i);
                    isFound = true;
                }
            }

            i++;
        }

        scanner.close();
    }
}