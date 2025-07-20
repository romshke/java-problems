import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int[] box1 = new int[] {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()}, box2 = new int[] {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

        Arrays.sort(box1);
        Arrays.sort(box2);

        boolean isFitting = true;

        if (box1[0] > box2[0]) {
            for (int i = 0; i < 3; i++) {
                if (box1[i] <= box2[i]) {
                    isFitting = false;
                    break;
                }
            }
            System.out.println(isFitting ? "Box 1 > Box 2" : "Incompatible");
        } else {
            for (int i = 0; i < 3; i++) {
                if (box2[i] <= box1[i]) {
                    isFitting = false;
                    break;
                }
            }
            System.out.println(isFitting ? "Box 1 < Box 2" : "Incompatible");
        }

        scanner.close();
    }
}