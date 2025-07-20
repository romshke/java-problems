import java.util.Scanner;

public class Main {
    static void print(String string) {
        System.out.println(string);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer from the user
        int dayNumber = scanner.nextInt();

        // Use a switch statement to determine the day of the week
        switch (dayNumber) {
            // Add cases for each day of the week (1-7)
            case 1:
                print("Monday");
                break;
            case 2:
                print("Tuesday");
                break;
            case 3:
                print("Wednesday");
                break;
            case 4:
                print("Thursday");
                break;
            case 5:
                print("Friday");
                break;
            case 6:
                print("Saturday");
                break;
            case 7:
                print("Sunday");
                break;
            default:
                print("Invalid input");
                break;

            // Add a default case for invalid input

        }

        scanner.close();
    }
}