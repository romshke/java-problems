import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the input number
        int n = sc.nextInt();
        if (n > 0) {
            // Write your code here. Use a while loop starting from n
            // and check for the smallest multiple of 3.
            int x = n;

            while (x % 3 != 0) {
                x++;
            }

            System.out.println(x);
        } else {
            System.out.println("-1");
        }
        sc.close();
    }
}