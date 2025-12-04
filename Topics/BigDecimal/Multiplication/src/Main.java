import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // write your code here
        try (Scanner scanner = new Scanner(System.in)) {
            BigDecimal first = new BigDecimal(scanner.nextLine()),
                    second = new BigDecimal(scanner.nextLine());

            System.out.println(first.multiply(second));
        }
    }
}