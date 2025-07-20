import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str = scanner.nextLine();

        str = str.replace('a', 'b');

        System.out.println(str);

        scanner.close();
    }
}