import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        try(Scanner scanner = new Scanner(System.in)) {
            BigInteger a = scanner.nextBigInteger(),
                    b = scanner.nextBigInteger(),
                    c = scanner.nextBigInteger(),
                    d = scanner.nextBigInteger();

            BigInteger result = a.negate().multiply(b).add(c).subtract(d);

            System.out.println(result);
        }
    }
}