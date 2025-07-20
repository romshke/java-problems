import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int number = scanner.nextInt();

        System.out.println(number < 1 ? "no army" : number <= 19 ? "pack" : number <= 249 ? "throng" : number <= 999 ? "zounds" : "legion");

        scanner.close();
    }
}