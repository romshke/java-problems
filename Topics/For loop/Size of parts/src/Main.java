import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int numberOfParts = scanner.nextInt(), readyToShip = 0, toBeFixed = 0, rejects = 0;

        for (int i = 0; i < numberOfParts; i++) {
            int partReadiness = scanner.nextInt();

            switch (partReadiness) {
                case 0:
                    readyToShip++;
                    break;
                case 1:
                    toBeFixed++;
                    break;
                case -1:
                    rejects++;
                    break;
            }
        }

        System.out.printf("%d %d %d", readyToShip, toBeFixed, rejects);

        scanner.close();
    }
}