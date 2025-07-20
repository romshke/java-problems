public class Main {
    public static void main(String[] args) {
        // Your code here
        Dog fido = new Dog();
        System.out.println(fido.speak());
    }
}

class Animal {
    public String speak() {
        // Your code here
        return "Animal sound...";
    }
}

class Dog extends Animal {
    @Override
    public String speak() {
        // Your code here
        return "Bark!";
    }
}