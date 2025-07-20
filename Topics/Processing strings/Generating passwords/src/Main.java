import java.util.*;

public class Main {
    static Random random = new Random();

    static char generateRandomChar(char start, char end) {
        return (char) random.nextInt(start, end + 1);
    }

    static void generatePassword(int count, char start, char end, StringBuilder password) {
        while (count > 0) {
            char randomChar = generateRandomChar(start, end);

            if (password.isEmpty()) {
                password.append(randomChar);
            } else {
                if (password.charAt(password.length() - 1) != randomChar) {
                    password.append(randomChar);
                } else {
                    continue;
                }
            }

            count--;
        }
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt(), n = scanner.nextInt();
        StringBuilder password = new StringBuilder();

        generatePassword(a, 'A', 'Z', password);
        generatePassword(b, 'a', 'z', password);
        generatePassword(c, '0', '9', password);

        while (password.length() < n) {
            int nextChoice = random.nextInt(3);

            switch (nextChoice) {
                case 0:
                    generatePassword(1, 'A', 'Z', password);
                    break;
                case 1:
                    generatePassword(1, 'a', 'z', password);
                    break;
                case 2:
                    generatePassword(1, '0', '9', password);
                    break;
            }
        }

        System.out.println(password);
    }
}