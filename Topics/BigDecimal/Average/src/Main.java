import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // write your code here
        try (Scanner scanner = new Scanner(System.in)) {
            BigDecimal first = new BigDecimal(scanner.nextLine()),
                    second = new BigDecimal(scanner.nextLine()),
                    third = new BigDecimal(scanner.nextLine());

            System.out.println(first.add(second).add(third).divide(BigDecimal.valueOf(3), 0, RoundingMode.DOWN));
        }
    }
}