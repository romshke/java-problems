import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // write your code here
        try (Scanner scanner = new Scanner(System.in)) {
            BigDecimal startingAmount = new BigDecimal(scanner.nextLine()),
                    yearlyPercent = new BigDecimal(scanner.nextLine());
            int years = Integer.parseInt(scanner.nextLine());

            BigDecimal finalAmount = startingAmount.multiply(
                    BigDecimal.ONE
                            .add(yearlyPercent.divide(new BigDecimal(100), 2, RoundingMode.CEILING))
                            .pow(years)).setScale(2, RoundingMode.CEILING);

            System.out.printf("Amount of money in the account: %s", finalAmount);
        }
    }
}