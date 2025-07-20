public class Main {

    public static void main(String[] args) {

        SingleMethodInterface instance = /* create an instance of an anonymous class here,
                                            do not forget ; in the end */
                new SingleMethodInterface() {
                    @Override
                    public void doSomething() {
                        System.out.println("The anonymous class does something");
                    }
                };

        instance.doSomething();
    }
}

interface SingleMethodInterface {

    void doSomething();
}