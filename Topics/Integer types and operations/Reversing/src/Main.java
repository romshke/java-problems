import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        char[] digits = scanner.next().toCharArray();
        StringBuilder strNumber = new StringBuilder();

        for (int i = 2; i >= 0; i--) {
            strNumber.append(digits[i]);
        }

        System.out.println(Integer.parseInt(strNumber.toString()));

        scanner.close();
    }
}