import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt(), y1 = scanner.nextInt();
        int x2 = scanner.nextInt(), y2 = scanner.nextInt();
        int dotProduct = x1 * x2 + y1 * y2;
        double magnitude1 = Math.sqrt(x1 * x1 + y1 * y1);
        double magnitude2 = Math.sqrt(x2 * x2 + y2 * y2);
        double cos = dotProduct / (magnitude1 * magnitude2);
        int angle = (int) Math.toDegrees(Math.acos(cos));
        System.out.println(angle);
        scanner.close();
    }
}