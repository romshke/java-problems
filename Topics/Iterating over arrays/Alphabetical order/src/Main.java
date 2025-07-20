import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        boolean isOrdered = true;

        for (int i = 0; i < strings.length - 1; i++) {
            if (strings[i].compareTo(strings[i + 1]) > 0) {
                isOrdered = false;
                break;
            }
        }

        System.out.println(isOrdered);

        scanner.close();
    }
}