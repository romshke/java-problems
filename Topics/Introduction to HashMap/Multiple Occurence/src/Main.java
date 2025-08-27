import java.util.HashMap;
import java.util.Scanner;

class Main {
    private static void printMostFrequentWord(String[] words) {
        // write your code here
        HashMap<String, Integer> hashMap = new HashMap<>();
        String mostFrequentWord = "";
        int mostFrequentWordCount = 0;

        for (String word : words) {
            if (hashMap.containsKey(word)) {
                hashMap.put(word, hashMap.get(word) + 1);

                if (hashMap.get(word) > mostFrequentWordCount) {
                    mostFrequentWord = word;
                    mostFrequentWordCount = hashMap.get(word);
                }
            } else {
                hashMap.put(word, 1);
            }
        }

        System.out.printf("%s %d", mostFrequentWord, mostFrequentWordCount);
    }

    // don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        printMostFrequentWord(words);
        scanner.close();
    }
}