import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String subString = scanner.nextLine();

        System.out.println((string.length() - string.replaceAll(subString, "").length()) / subString.length());
    }
}