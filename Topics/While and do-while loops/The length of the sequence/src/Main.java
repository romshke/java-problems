import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int count = 0;

        while (true) {
            int number = scanner.nextInt();

            if (number != 0) {
                count++;
            } else {
                break;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}