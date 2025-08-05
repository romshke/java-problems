import java.util.Scanner;

class Main {
    static boolean isPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return str.contentEquals(stringBuilder);
    }

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(isPalindrome(input) ? "yes" : "no");
        scanner.close();
    }
}