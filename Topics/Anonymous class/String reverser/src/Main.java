import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        StringReverser reverser = /* create an instance of an anonymous class here,
                                     do not forget ; on the end */
                new StringReverser() {
                    @Override
                    public String reverse(String str) {
                        return new StringBuilder(str).reverse().toString();
                    }
                };

        System.out.println(reverser.reverse(line));

        scanner.close();
    }

    interface StringReverser {

        String reverse(String str);
    }

}