import java.util.*;

class BankCard {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String numbers = scn.nextLine();
        String card = numbers.replaceAll("\\s", "");
        String visaRegex = "4\\d{3}\\d{4}\\d{4}\\d{4}";
        String masterCardRegex = 
                "(5[1-5]\\d{2}\\d{4}\\d{4}\\d{4}|" +
                "222[1-9]\\d{4}\\d{4}\\d{4}|" +
                "22[3-9]\\d\\d{4}\\d{4}\\d{4}|" +
                "2[3-6]\\d{2}\\d{4}\\d{4}\\d{4}|" +
                "27[01]\\d\\d{4}\\d{4}\\d{4}|" +
                "2720\\d{4}\\d{4}\\d{4})";
        String americanExpressRegex = "(34|37)\\d{13}";

        if (card.matches(visaRegex)) {
            System.out.println("Visa");
        } else if (card.matches(masterCardRegex)) {
            System.out.println("MasterCard");
        } else if (card.matches(americanExpressRegex)) {
            System.out.println("AmericanExpress");
        } else {
            System.out.println("Card number does not exist");
        }
    }
}