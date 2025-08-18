import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        try (Scanner scanner = new Scanner(System.in)) {
            LocalTime range1Start = LocalTime.parse(scanner.next()),
                    range1End = LocalTime.parse(scanner.next()),
                    range2Start = LocalTime.parse(scanner.next()),
                    range2End = LocalTime.parse(scanner.next());

            System.out.println(
                    range1Start.isAfter(range2Start) && range1Start.isBefore(range2End) ||
                    range1End.isAfter(range2Start) && range1End.isBefore(range2End) ||
                    range2Start.isAfter(range1Start) && range2Start.isBefore(range1End) ||
                    range2End.isAfter(range1Start) && range2End.isBefore(range1End) ||
                    range1Start.equals(range2Start) || range1Start.equals(range2End) ||
                    range1End.equals(range2Start) || range1End.equals(range2End)
            );
        }
    }
}