import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final String str = scanner.nextLine();
        final int number = Integer.parseInt(scanner.nextLine());

        Returner returner = /* create an instance of an anonymous class here, 
                               do not forget ; on the end;
                               variables str and number will be accessible during testing */
                new Returner() {
                    @Override
                    public String returnString() {
                        return str;
                    }

                    @Override
                    public int returnInt() {
                        return number;
                    }
                };

        System.out.println(returner.returnString());
        System.out.println(returner.returnInt());

        scanner.close();
    }
}

interface Returner {

    String returnString();

    int returnInt();
}