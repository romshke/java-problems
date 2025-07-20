import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int numberOfElements = scanner.nextInt();

        for (int i = 0; i < numberOfElements; i++) {
            deque.add(scanner.nextInt());
        }

        while (!deque.isEmpty()) {
            System.out.println(deque.pollLast());
        }

        scanner.close();
    }
}