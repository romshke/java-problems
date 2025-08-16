import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // TODO: Write a lambda expression that checks if n is divisible by both 3 and 5
        Function<Integer, Boolean> isDivisibleBy3And5 = (num) -> num % 3 == 0 && num % 5 == 0;

        System.out.println(/* TODO: Apply the lambda expression to n */isDivisibleBy3And5.apply(n));
    }
}