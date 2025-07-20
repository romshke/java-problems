import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");

        for (String s : str) {
            list.add(Integer.parseInt(s));
        }
        int number = scanner.nextInt();
        int minDifference = Math.abs(list.get(0) - number);

        for (int i : list) {
            if (Math.abs(i - number) < minDifference) {
                minDifference = Math.abs(i - number);
            }
        }

        for (int numberInList : list) {
            if (Math.abs(numberInList - number) == minDifference) {
                result.add(numberInList);
            }
        }

        result.sort(null);

        for (int i : result) {
            System.out.print(i + " ");
        }

    }
}