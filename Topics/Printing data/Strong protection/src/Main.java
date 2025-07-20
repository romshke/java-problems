class Main {
    public static void main(String[] args) {
        //write your code here
        for (int i = 1; i < 10; i++) {
            System.out.printf(i % 3 != 0 ? "%d " : "%d%n", i);
        }
        System.out.println("* 0 #");
    }
}