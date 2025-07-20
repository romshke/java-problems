import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = new String[5];
        // start coding here
        for (int i = 0; i < 5; i++) {
            words[i] = sc.next();
        }

        for (String word : words) {
            System.out.println(word);
        }

        sc.close();
    }
}