import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        StringBuilder str2 = new StringBuilder();

        for (String str : str1.split("")) {
            str2.append(str).append(str);
        }

        System.out.println(str2);
        scanner.close();
    }
}