package calculator;

public class MathOperation {
    public static double addition(double a, double b) {
        return a + b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b==0)
            throw new ArithmeticException("Ошибка! На ноль делить нельзя. Перезапустите калькулятор.");
        return a / b;
    }
}
