import java.util.*;

public class Main {

    public static void processIterator(String[] array) {
        // write your code here
        List<String> list = new ArrayList<>(Arrays.asList(array));
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.charAt(0) != 'J') {
                iterator.remove();
            } else {
                next = next.substring(1);
                iterator.set(next);
            }
        }

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processIterator(scanner.nextLine().split(" "));
        scanner.close();
    }
}