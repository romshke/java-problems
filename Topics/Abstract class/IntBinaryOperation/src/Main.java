abstract class IntBinaryOperation {

    protected final int firstArg;
    protected final int secondArg;

    public IntBinaryOperation(int firstArg, int secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public abstract int perform();
}

// declare and implement your classes here
class Addition extends IntBinaryOperation {

    public Addition(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }

    @Override
    public int perform() {
        return firstArg + secondArg;
    }
}

class Multiplication extends IntBinaryOperation {

    public Multiplication(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }

    @Override
    public int perform() {
        return firstArg * secondArg;
    }
}