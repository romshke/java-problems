import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h1 = scanner.nextInt(), h2 = scanner.nextInt(), h3 = scanner.nextInt();

        System.out.println(h1 >= h2 && h2 >= h3 || h1 <= h2 && h2 <= h3);

        scanner.close();
    }
}