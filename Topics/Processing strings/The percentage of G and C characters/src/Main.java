import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        int count = 0;

        for (char ch : input.toCharArray()) {
            if (ch == 'c' || ch == 'g') {
                count++;
            }
        }

        double result = (double) count / input.length() * 100;
        System.out.println(result);

        scanner.close();
    }
}