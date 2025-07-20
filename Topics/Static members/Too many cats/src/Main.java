class Cat {

    // write static and instance variables
    String name;
    int age;
    static int counter;

    public Cat(String name, int age) {
        // implement the constructor
        // do not forget to check the number of cats
        counter++;
        System.out.printf(counter > 5 ? "You have too many cats%n" : "");
    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }
}