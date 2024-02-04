package lambdas;
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class MathOperator {

    public static int executeMathOperation(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }
}






