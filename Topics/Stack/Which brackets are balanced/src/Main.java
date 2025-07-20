import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
     static String getClosingBracket(String openingBracket) {
        switch (openingBracket) {
            case "(":
                return ")";
            case "[":
                return "]";
            case "{":
                return "}";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Deque<String> stack = new ArrayDeque<>();

        Pattern brackets = Pattern.compile("[()\\[\\]{}]");
        Matcher bracketsMatcher = brackets.matcher(input);

        if (input.length() % 2 != 0) {
            System.out.println(false);
            return;
        }

        while (bracketsMatcher.find()) {
            String bracket = bracketsMatcher.group();

            switch (bracket) {
                case String str when str.matches("[(\\[{]"):
                    stack.push(bracket);
                    break;
                case String str when str.matches("[)\\]}]"):
                    if (stack.isEmpty()) {
                        System.out.println(false);
                        return;
                    } else if (!getClosingBracket(stack.peek()).equals(bracket)) {
                        System.out.println(false);
                        return;
                    } else {
                        stack.pop();
                    }
                    break;
                default:
                    return;
            }
        }

        System.out.println(true);

        scanner.close();
    }
}