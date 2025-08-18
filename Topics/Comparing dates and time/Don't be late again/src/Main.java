import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Integer.parseInt(scanner.nextLine());
            LocalTime timeToCompare = LocalTime.parse("20:00");
            Map<String, LocalTime> storesClosingTime = new LinkedHashMap<>();

            for (int i = 0; i < n; i++) {
                String store = scanner.next();
                LocalTime closingTime = LocalTime.parse(scanner.next());

                if (closingTime.isAfter(timeToCompare)) {
                    storesClosingTime.put(store, closingTime);
                }
            }

            for (String store : storesClosingTime.keySet()) {
                System.out.println(store);
            }
        }
    }
}