package net.belogolovsky.calc;

public class Calculator {

    public static int evaluate(int op1, int op2, char operator) throws ArithmeticException {
        int result = 0;
        switch (operator) {
            case '+':
                result = op1 + op2;
                break;
            case '-':
                result = op1 - op2;
                break;
            case '*':
                result = op1 * op2;
                break;
            case '/':
                if (op2 == 0) {
                    throw new ArithmeticException("На ноль делить нельзя");
                } else {
                    result = op1 / op2;
                }
                break;
            default:
                throw new ArithmeticException("Неизвестная операция");

        }
        return result;
    }
}
