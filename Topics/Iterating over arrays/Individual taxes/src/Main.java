import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int numberOfCompanies = scanner.nextInt();
        int[] yearlyIncomes = new int[numberOfCompanies];
        int[] individualTaxes = new int[numberOfCompanies];
        double maxTax = 0;
        int maxTaxCompany = 1;

        for (int i = 0; i < numberOfCompanies; i++) {
            yearlyIncomes[i] = scanner.nextInt();
        }

        for (int i = 0; i < numberOfCompanies; i++) {
            individualTaxes[i] = scanner.nextInt();
        }

        for (int i = 0; i < numberOfCompanies; i++) {
            double tax = (double) yearlyIncomes[i] * individualTaxes[i] / 100;
            if (tax > maxTax) {
                maxTax = tax;
                maxTaxCompany = i + 1;
            }
        }

        System.out.println(maxTaxCompany);

        scanner.close();
    }
}