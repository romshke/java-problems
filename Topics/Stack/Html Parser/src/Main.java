import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String html = scanner.nextLine();
        Deque<Integer> stack = new ArrayDeque<>();

        Pattern pattern = Pattern.compile("</?\\w+>");
        Matcher matcher = pattern.matcher(html);

        while (matcher.find()) {
            String tag = matcher.group();
            if (tag.matches("<\\w+>")) {
                stack.add(matcher.end());
            } else if (tag.matches("</\\w+>")) {
                int index = stack.pollLast();
                System.out.println(html.substring(index, matcher.start()));
            }
        }

        scanner.close();
    }
}