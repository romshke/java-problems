import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the string input from the user
        String input = scanner.nextLine();

        // Split the string by commas into an array of names
        String[] names = input.split(",");

        // TODO: Implement a Set to keep track of unique names
        // The Set interface is part of Java's collections framework and is used
        // to store unique elements - duplicates are automatically disregarded
        Set<String> uniqueNames = new LinkedHashSet<>(Arrays.asList(names));

        uniqueNames.forEach(name -> System.out.printf(name.equals(uniqueNames.toArray()[uniqueNames.size() - 1]) ? "%s" : "%s,", name));

        scanner.close();
    }
}