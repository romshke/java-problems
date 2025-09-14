import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor; // assign an object to it

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            // create and submit tasks
            executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
            executor.submit(new PrintIfPrimeTask(number));
            executor.shutdown();
        }
    }
}

class PrintIfPrimeTask implements Runnable {
    private final int number;

    public PrintIfPrimeTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        // write code of task here
        if (number > 1) {
            if (number == 2) {
                System.out.println(number);
            } else if (number % 2 != 0) {
                for (int i = 3; i <= Math.sqrt(number); i += 2) {
                    if (number % i == 0) {
                        return;
                    }
                }
                System.out.println(number);
            }
        }
    }
}