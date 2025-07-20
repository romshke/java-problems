import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int numberOfPeanutButterCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        if (numberOfPeanutButterCups >= 10 && numberOfPeanutButterCups <= 20 && !isWeekend) {
            System.out.println(true);
        } else System.out.println(numberOfPeanutButterCups >= 15 && numberOfPeanutButterCups <= 25 && isWeekend);

        scanner.close();
    }
}