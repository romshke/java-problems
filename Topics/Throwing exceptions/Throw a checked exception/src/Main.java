import java.io.FileNotFoundException;

public class Main {

    public static void method() throws FileNotFoundException {
        // write your code here
        throw new FileNotFoundException();
    }

    /* Do not change code below */
    public static void main(String[] args) {
        try {
            method();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}