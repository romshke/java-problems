import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // write your code here
        try (Scanner scanner = new Scanner(System.in)) {
            BigDecimal Dwalin = new BigDecimal(scanner.nextLine()),
                    Balin = new BigDecimal(scanner.nextLine()),
                    Thorin = new BigDecimal(scanner.nextLine()),
                    totalGold = Dwalin.add(Balin).add(Thorin);

            System.out.println(totalGold);
        }
    }
}