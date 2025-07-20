import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] strArr = scanner.nextLine().split("-");

        System.out.printf("%s/%s/%s", strArr[1], strArr[2], strArr[0]);

        scanner.close();
    }
}