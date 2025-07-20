import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CheckTheEssay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // write your code here
        Pattern pattern = Pattern.compile("(Franse|Eifel tower|19th|20th|21st)");
        Matcher matcher = pattern.matcher(text);

        System.out.println(matcher.replaceAll(match -> {
            switch (match.group()) {
                case "Franse":
                    return "France";
                case "Eifel tower":
                    return "Eiffel Tower";
                case "19th":
                    return "XIXth";
                case "20th":
                    return "XXth";
                case "21st":
                    return "XXIst";
                default:
                    return match.group();
            }
        }));

        scanner.close();
    }
}