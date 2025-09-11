import java.util.List;

class Utils {

    public static List<Integer> sortOddEven(List<Integer> numbers) {
        numbers.sort(
                (a, b) -> {
                    if (a % 2 == 0 && b % 2 != 0) {
                        return 1;
                    } else if (a % 2 != 0 && b % 2 == 0) {
                        return -1;
                    } else if (a % 2 == 0) {
                        return b.compareTo(a);
                    } else {
                        return a.compareTo(b);
                    }
                }
        );

        return numbers;
    }
}