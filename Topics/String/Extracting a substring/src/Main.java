import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str = scanner.nextLine();
        int start = scanner.nextInt(), end = scanner.nextInt();

        System.out.println(str.substring(start, end + 1));
        scanner.close();
    }
}