import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int busHeight = scanner.nextInt(), numberOfBridges = scanner.nextInt();
        boolean isCrushed = false;

        for (int i = 0; i < numberOfBridges; i++) {
            int bridgeHeight = scanner.nextInt();

            if (busHeight >= bridgeHeight) {
                isCrushed = true;
                System.out.printf("%nWill crash on bridge %d",i + 1);
                break;
            }
        }

        if (!isCrushed) {
            System.out.println("Will not crash");
        }

        scanner.close();
    }
}