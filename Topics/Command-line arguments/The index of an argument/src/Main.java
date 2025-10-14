import java.util.Arrays;

class Problem {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(args).contains("test") ?
                Arrays.asList(args).indexOf("test") : -1);
    }
}