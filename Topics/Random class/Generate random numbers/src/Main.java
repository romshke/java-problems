import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int n = scanner.nextInt(), a = scanner.nextInt(), b = scanner.nextInt();
        Random random = new Random(a + b);
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += random.nextInt(b - a + 1) + a;
        }

        System.out.println(sum);

        scanner.close();
    }
}