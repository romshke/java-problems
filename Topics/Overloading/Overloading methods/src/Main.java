import java.util.Scanner;

public class Main {

    public static long getMaxMinusCurrent(long val) {
        return Long.MAX_VALUE - val;
    }

    // write a method here
    // public static ...
    public static int getMaxMinusCurrent(int val) {
        return Integer.MAX_VALUE - val;
    }

    // Do not change code below

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.nextLine();
        switch (type) {
            case "long":
                final long longVal = Long.parseLong(scanner.nextLine());
                final long longResult = getMaxMinusCurrent(longVal);
                System.out.println(longResult);
                break;
            case "int":
                final int intVal = Integer.parseInt(scanner.nextLine());
                final int intResult = getMaxMinusCurrent(intVal);
                System.out.println(intResult);
                break;
            default:
                System.out.println("Unknown type found");
                break;
        }
        scanner.close();
    }
}