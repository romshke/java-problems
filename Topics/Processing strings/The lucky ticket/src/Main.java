import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        char[] ticketNumbers = scanner.nextLine().toCharArray();
        System.out.println(ticketNumbers[0] + ticketNumbers[1] + ticketNumbers[2] == ticketNumbers[3] + ticketNumbers[4] + ticketNumbers[5] ? "Lucky" : "Regular");
        scanner.close();
    }
}