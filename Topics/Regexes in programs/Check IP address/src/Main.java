import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String regex = "(\\d\\.|[1-9]\\d\\.|1\\d\\d\\.|2[0-4]\\d\\.|25[0-5]\\.){3}(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])";

        String ipAddress = scanner.nextLine();
        if (ipAddress.matches(regex)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}