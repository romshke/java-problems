import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();

        if (n > s.length()) {
            System.out.println(s);
        } else {
            String firstPart = s.substring(0, n);
            String secondPart = s.substring(n);
            System.out.println(secondPart + firstPart);
        }

        scanner.close();
    }
}