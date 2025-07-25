import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "(0\\d|1\\d|2[0-3]):(0\\d|[1-5]\\d)";

        String time = scanner.nextLine();

        System.out.println(time.matches(regex) ? "YES" : "NO");

        scanner.close();
    }
}