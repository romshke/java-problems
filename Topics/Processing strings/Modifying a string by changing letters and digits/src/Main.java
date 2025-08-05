import java.util.Scanner;

public class Main {
    public static String transformString(String s) {
        // implement your string processing here
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                if (c == '0') {
                    stringBuilder.append('9');
                } else {
                    stringBuilder.append((char) (c - 1));
                }
            } else {
                if (c == 'z') {
                    stringBuilder.append('a');
                } else {
                    stringBuilder.append((char) (c + 1));
                }
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(transformString(s));
        input.close();
    }
}