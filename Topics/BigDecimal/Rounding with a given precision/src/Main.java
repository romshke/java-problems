import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // write your code here
        try (Scanner scanner = new Scanner(System.in)) {
            BigDecimal number = new BigDecimal(scanner.nextLine());
            int scale = Integer.parseInt(scanner.nextLine());

            System.out.println(number.setScale(scale, RoundingMode.HALF_DOWN));
        }
    }   
}