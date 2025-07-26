import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toCharArray();

        for (int i = 0; i < input.length - 1; i++) {
            if (input[i + 1] - input[i] != 1) {
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
    }
}