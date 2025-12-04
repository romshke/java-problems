import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // write your code here
        try (Scanner scanner = new Scanner(System.in)) {
            int power = Integer.parseInt(scanner.nextLine()), scale = Integer.parseInt(scanner.nextLine());
            BigDecimal number = new BigDecimal(scanner.nextLine());

            number = number.setScale(scale, RoundingMode.FLOOR);
            number = number.pow(power);

            System.out.println(number);
        }
    }
}