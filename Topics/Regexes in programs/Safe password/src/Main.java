import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        String[] passwordChars = scanner.nextLine().split("");
        boolean hasUppercase = false, hasLowercase = false, hasDigit = false;

        for (String str : passwordChars) {
            if (str.matches("[A-Z]")) {
                hasUppercase = true;
            }

            if (str.matches("[a-z]")) {
                hasLowercase = true;
            }

            if (str.matches("[0-9]")) {
                hasDigit = true;
            }
        }

        System.out.println(hasUppercase && hasLowercase && hasDigit && passwordChars.length >= 12? "YES" : "NO");

        scanner.close();
    }
}