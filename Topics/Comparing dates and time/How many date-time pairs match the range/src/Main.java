import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    static LocalDateTime getEarlierBorder(String dateTime1, String dateTime2) {
        return LocalDateTime.parse(dateTime1).isBefore(LocalDateTime.parse(dateTime2)) ? LocalDateTime.parse(dateTime1) : LocalDateTime.parse(dateTime2);
    }

    static LocalDateTime getLaterBorder(String dateTime1, String dateTime2) {
        return LocalDateTime.parse(dateTime1).isAfter(LocalDateTime.parse(dateTime2)) ? LocalDateTime.parse(dateTime1) : LocalDateTime.parse(dateTime2);
    }

    public static void main(String[] args) {
        // put your code here
        try (Scanner scanner = new Scanner(System.in)) {
            String dateTime1 = scanner.next(), dateTime2 = scanner.next();
            LocalDateTime earlierBorder = getEarlierBorder(dateTime1, dateTime2), laterBorder = getLaterBorder(dateTime1, dateTime2);
            int n = scanner.nextInt();
            int count = 0;

            for (int i = 0; i < n; i++) {
                LocalDateTime dateTime = LocalDateTime.parse(scanner.next());
                count += (dateTime.equals(earlierBorder) || dateTime.isAfter(earlierBorder)) && dateTime.isBefore(laterBorder) ? 1 : 0;
            }

            System.out.println(count);
        }
    }
}