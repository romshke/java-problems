import java.util.Scanner;

class StringProcessor extends Thread {

    final Scanner scanner = new Scanner(System.in); // use it to read string from the standard input

    @Override
    public void run() {
        // implement this method
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            if (line.toUpperCase().equals(line)) {
                System.out.println("FINISHED");
                break;
            } else {
                System.out.println(line.toUpperCase());
            }
        }
    }
}