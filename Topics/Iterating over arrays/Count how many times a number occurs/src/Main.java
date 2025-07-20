import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt(), counter = 0;

        for (int num : array)  {
            if (num == n) {
                counter++;
            }
        }

        System.out.println(counter);

        scanner.close();
    }
}