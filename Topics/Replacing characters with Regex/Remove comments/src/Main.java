import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codeWithComments = scanner.nextLine();

        // write your code here
        Pattern pattern = Pattern.compile("(/\\*.*?\\*/|//.*?$)", Pattern.MULTILINE | Pattern.DOTALL);
        System.out.println(pattern.matcher(codeWithComments).replaceAll(""));
        scanner.close();
    }
}