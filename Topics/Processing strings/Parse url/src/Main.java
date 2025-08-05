import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        String[] parameters = url.substring(url.indexOf('?') + 1).split("&");
        String password = "";

        for (String parameter : parameters) {
            String[] keyValue = parameter.split("=");
            String key = keyValue[0];
            String value = keyValue.length > 1 ? keyValue[1] : "not found";

            if (key.equals("pass") && !value.equals("not found")) {
                password = value;
            }

            System.out.println(key + " : " + value);
        }

        if (!password.isEmpty()) {
            System.out.println("password : " + password);
        }

        scanner.close();
    }
}