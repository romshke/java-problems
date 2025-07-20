import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine().toLowerCase();
        String line = scanner.nextLine().toLowerCase();

        // write your code here
        Pattern pattern = Pattern.compile(".*(\\b" + part + "|" + part + "\\b).*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(line);
        System.out.println(matcher.matches() ? "YES": "NO");

        scanner.close();
    }
}