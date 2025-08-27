import java.util.HashMap;
import java.util.Scanner;

class Main {
    private static void printCommon(int[] firstArray, int[] secondArray) {
        // Enter your Code Here
        HashMap<Integer, Integer> firstMap = new HashMap<>();
        HashMap<Integer, Integer> resultMap = new HashMap<>();

        for (int num : firstArray) {
            firstMap.put(num, 0);
        }

        for (int num : secondArray) {
            if (firstMap.containsKey(num)) {
                resultMap.put(num, 0);
            }
        }

        for (int num : resultMap.keySet()) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] firstArray = new int [n];
        int[] secondArray = new int [n];
        for (int i = 0; i < n; ++i) { 
            firstArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; ++i) { 
            secondArray[i] = scanner.nextInt();
        }

        printCommon(firstArray,secondArray);
        scanner.close();
    }
}