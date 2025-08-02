import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String vowels = "aeiouyAEIOUY", previousChar = "", input = scanner.nextLine();
        int count = 0, result = 0;


        for (String ch : input.split("")) {
            if (vowels.contains(ch)) {
                if (count != 0 && !vowels.contains(previousChar)) {
                    count = 1;
                } else {
                    count++;
                }

                previousChar = ch;
            } else {
                if (count != 0 && vowels.contains(previousChar)) {
                    count = 1;
                } else {
                    count++;
                }

                previousChar = ch;
            }

            if (count == 3) {
                result++;
                count = 1;
            }
        }

        System.out.println(result);

        scanner.close();
    }
}