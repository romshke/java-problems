import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        
        System.out.println(second + " " + first);

        scanner.close();
    }
}