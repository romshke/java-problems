import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {scanner.next(), scanner.next(), scanner.next(), scanner.next()}; // Scanning the first name out of 4 names, three more to go
        // continue coding here
        for (int i = 3; i >= 0; i--) {
            System.out.println(names[i]);
        }

        scanner.close();
    }
}