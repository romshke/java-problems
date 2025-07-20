import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        Set<String> dictionary = new HashSet<>();
        Set<String> result = new HashSet<>();
        int d = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < d; i++) {
            dictionary.add(scanner.nextLine().toLowerCase());
        }

        int l = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < l; i++) {
            String[] words = scanner.nextLine().toLowerCase().split("\\s+");

            for (String word : words) {
                if (!dictionary.contains(word)) {
                    result.add(word);
                }
            }
        }

        result.forEach(System.out::println);

        scanner.close();
    }
}