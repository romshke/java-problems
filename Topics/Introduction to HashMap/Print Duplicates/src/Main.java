import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Main {
    private static void printDuplicate(int[] map) {
        // Enter your Code Here
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i : map) {
            if (hashMap.containsKey(i)) {
                hashMap.put(i, hashMap.get(i) + 1);
            } else {
                hashMap.put(i, 1);
            }
        }

        for (int i : hashMap.keySet()) {
            if (hashMap.get(i) > 1) {
                result.add(i);
            }
        }

        result.sort(null);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] map = new int[n];
        for (int i = 0; i < n; ++i) { 
            map[i] = scanner.nextInt();
        }
        printDuplicate(map);
        scanner.close();
    }
}