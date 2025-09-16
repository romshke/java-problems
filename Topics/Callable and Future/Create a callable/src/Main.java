import java.util.Scanner;
import java.util.concurrent.Callable;

class CallableUtil {
    public static Callable<String> getCallable() {
        // implement method
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            return () -> input;
        }
    }
}