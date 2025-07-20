import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String string = scanner.nextLine();
        System.out.println(string.toLowerCase().charAt(0) == 'j');

        scanner.close();
    }
}