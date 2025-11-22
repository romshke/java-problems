import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        try (Scanner scanner =  new Scanner(System.in)) {
            BigInteger M = scanner.nextBigInteger();
            long n = 2;

            while (M.compareTo(BigInteger.valueOf(n)) > 0) {
                M = M.divide(BigInteger.valueOf(n));
                n++;
            }

            System.out.println(n);
        }
    }
}