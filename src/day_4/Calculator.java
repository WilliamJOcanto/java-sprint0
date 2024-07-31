package day_4;

public class Calculator implements CalculatorOperations{

    @Override
    public double addition(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero");
            return Double.NaN;
        }
        return num1 / num2;
    }
}
