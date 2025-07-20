import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        String[] strings = {sc.nextLine(), sc.nextLine(), sc.nextLine()};

        for (int i = 2; i >= 0; i--) {
            System.out.println(strings[i]);
        }


        sc.close();
    }
}