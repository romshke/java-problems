import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FindTheKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // write your code here
        Pattern pattern = Pattern.compile("(the\\s+key\\s+is\\s+)([0-9A-Za-z&&[^AEIOUaeiou]]+|[AEIOUaeiou?!#]+)(\\s+|$)",  Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group(2));
        }

        scanner.close();
    }
}