class Problem {
    public static void main(String[] args) {
        int result;

        switch (args[0]) {
            case "+" -> result = Integer.parseInt(args[1]) + Integer.parseInt(args[2]);
            case "-" -> result = Integer.parseInt(args[1]) - Integer.parseInt(args[2]);
            case "*" -> result = Integer.parseInt(args[1]) * Integer.parseInt(args[2]);
            default -> {
                System.out.println("Unknown operator");
                return;
            }
        }

        System.out.println(result);
    }
}