import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String dna = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;

        if (dna.length() == 1) {
            stringBuilder.append(dna.charAt(0));
            stringBuilder.append(1);
            System.out.println(stringBuilder);
            return;
        }

        for (int i = 0; i < dna.length() - 1; i++) {
            if (dna.charAt(i) == dna.charAt(i + 1)) {
                count++;
            } else if (dna.charAt(i) != dna.charAt(i + 1)) {
                stringBuilder.append(dna.charAt(i));
                stringBuilder.append(count + 1);
                count = 0;
            }

            if (i == dna.length() - 2) {
                stringBuilder.append(dna.charAt(i + 1));
                stringBuilder.append(count + 1);
            }
        }

        System.out.println(stringBuilder);

        scanner.close();
    }
}