import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String result = "";

        // function calls of isDivByThree, isDivByFive, isDivByThreeAndFive will be here
        if (isDivByThree(num)) {
            result += "Fizz";
        }
        if (isDivByFive(num)) {
            result += "Buzz";
        }
        if (result.isEmpty()) {
            result = "None";
        }

        System.out.println(result);

        scanner.close();
    }
    // function isDivByThree will be here
    static boolean isDivByThree(int num) {
        return num % 3 == 0;
    }

    // function isDivByFive will be here
    static boolean isDivByFive(int num) {
        return num % 5 == 0;
    }

    // function isDivByThreeAndFive will be here
}