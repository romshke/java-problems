import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int numberOfGrades = scanner.nextInt(), d = 0, c = 0, b = 0, a = 0;

        for (int i = 0; i < numberOfGrades; i++) {
            String grade = scanner.next();
            switch (grade) {
                case "A":
                    a++;
                    break;
                case "B":
                    b++;
                    break;
                case "C":
                    c++;
                    break;
                case "D":
                    d++;
                    break;
            }
        }

        System.out.printf("%d %d %d %d", d, c, b, a);

        scanner.close();
    }
}