import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int[] numbers = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

        System.out.println(numbers[0] != numbers[1] && numbers[0] != numbers[2] && numbers[1] != numbers[2]);

        scanner.close();
    }
}