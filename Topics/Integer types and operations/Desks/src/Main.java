import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int result = 0;

        for (int group = 0; group < 3; group++) {
            int numberOfStudents = scanner.nextInt();

            if (numberOfStudents % 2 == 0) {
                result += numberOfStudents / 2;
            } else {
                result += (numberOfStudents + 1) / 2;
            }
        }

        scanner.close();

        System.out.println(result);
    }
}