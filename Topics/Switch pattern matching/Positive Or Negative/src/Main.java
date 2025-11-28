import java.util.Scanner;

public class Main {
    // implement the method below
    public static void checkNumber(Object number) {
        // your code goes here ...
        switch (number) {
            case Integer i -> System.out.println(i > 0 ? "Positive integer" : i == 0 ? "Zero" : "Negative integer");
            default -> System.out.println("Not an integer");
        }
    }

    // please do not change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            checkNumber(number);
        } catch (NumberFormatException e) {
            checkNumber(input);
        }

        scanner.close();
    }
}