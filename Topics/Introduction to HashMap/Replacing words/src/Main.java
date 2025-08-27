import java.util.HashMap;
import java.util.Scanner;

class Main {
    private static void printReplacedString(HashMap<String,String> map, String[] array) {
        // implement me
        for (String s : array) {
            System.out.print(map.getOrDefault(s, s) + " ");
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] array = new String [n];
        for (int i = 0; i < n; ++i) {
            array[i] = scanner.next();
        }
        int m = scanner.nextInt();

        for (int i = 0; i < m; ++i) {
            map.put(scanner.next(), scanner.next());
        } 

        printReplacedString(map,array);
        scanner.close();
    }
}