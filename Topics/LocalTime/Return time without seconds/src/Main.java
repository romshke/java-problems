import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println(LocalTime.parse(scanner.nextLine()).format(DateTimeFormatter.ofPattern("HH:mm")));
        scanner.close();
    }
}