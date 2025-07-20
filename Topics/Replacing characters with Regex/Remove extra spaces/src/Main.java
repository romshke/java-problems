import java.util.Scanner;
import java.util.regex.Pattern;

class RemoveExtraSpacesProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // write your code here
        Pattern pattern = Pattern.compile("\\s{2,}");
        System.out.println(pattern.matcher(text).replaceAll(" "));

        scanner.close();
    }
}