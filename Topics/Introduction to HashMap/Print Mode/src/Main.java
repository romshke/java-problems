import java.util.HashMap;
import java.util.Scanner;

class Main {
    private static void printMode(int[] map) {
        // Enter your Code Here
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int modeKey = 0;
        int modeValue = 0;

        for (int num : map) {
            if (hashMap.containsKey(num)) {
                hashMap.put(num, hashMap.get(num) + 1);

                if (hashMap.get(num) > modeValue) {
                    modeKey = num;
                    modeValue = hashMap.get(num);
                }
            } else {
                hashMap.put(num, 1);
            }
        }

        System.out.printf("%d %d", modeKey, modeValue);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] map = new int [n];
        for (int i = 0; i < n; ++i) { 
            map[i] = scanner.nextInt();
        }

        printMode(map);

        scanner.close();
    }
}