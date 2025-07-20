import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        System.out.printf("The form for %s is completed. We will contact you if we need a chef who cooks %s dishes and has %d years of experience.", sc.nextLine(), sc.nextLine(), sc.nextInt());

        sc.close();
    }
}