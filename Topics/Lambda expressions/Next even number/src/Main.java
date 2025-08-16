import java.util.function.LongUnaryOperator;

class Operator {

    public static LongUnaryOperator unaryOperator = number -> number % 2 == 0 ? number + 2 : number + 1;
}