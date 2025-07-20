import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input;
        ArrayList<String> output = new ArrayList<>();

        while (true) {
            input = scanner.nextLine();

            if (input.equals("0")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                output.add(String.valueOf(number * 10));
            } catch (NumberFormatException e) {
                output.add("Invalid user input: " + input);
            }

        }

        for (String s : output) {
            System.out.println(s);
        }

        scanner.close();
    }
}