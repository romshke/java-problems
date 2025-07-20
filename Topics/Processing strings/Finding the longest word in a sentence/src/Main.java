import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine(), longestWord = "";
        int longestWordLength = Integer.MIN_VALUE;
        
        
        // Your code here
        for (String str : sentence.split(" ")) {
            if (str.length() > longestWordLength) {
                longestWordLength = str.length();
                longestWord = str;
            }
        }

        System.out.println(longestWord);

        scanner.close();
    }
}