import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // call the method here
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt(), h = scanner.nextInt();
        countAreaOfParallelogram(b, h);
        scanner.close();
    }

    // Do not change code below   
    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}