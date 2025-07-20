import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt(), max = Integer.MIN_VALUE, maxIndex = 0;

        for (int i = 0; i < len; i++) {
            int number = scanner.nextInt();
            if (number > max) {
                max = number;
                maxIndex = i;
            }
        }

        System.out.println(maxIndex);

        scanner.close();
    }
}