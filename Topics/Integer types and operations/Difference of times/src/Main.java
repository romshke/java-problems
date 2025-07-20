import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int[] moment1 = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        int[] moment2 = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

        System.out.println(moment2[0] * 3600 + moment2[1] * 60 + moment2[2] - (moment1[0] * 3600 + moment1[1] * 60 + moment1[2]));

        scanner.close();
    }
}