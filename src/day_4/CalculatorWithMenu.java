package day_4;

import java.util.Scanner;

public class CalculatorWithMenu implements CalculatorMenu {

    private CalculatorOperations calculator;
    private Scanner scanner;

    public CalculatorWithMenu() {
        this.calculator = new Calculator();
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void displayMenu() {
        System.out.println("Calculator Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    @Override
    public void executeOperation(int option) {
        double result = 0;
        switch (option) {
            case 1:
                System.out.print("Enter first number: ");
                double add1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double add2 = scanner.nextDouble();
                result = calculator.addition(add1, add2);
                break;
            case 2:
                System.out.print("Enter first number: ");
                double sub1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double sub2 = scanner.nextDouble();
                result = calculator.subtraction(sub1, sub2);
                break;
            case 3:
                System.out.print("Enter first number: ");
                double mul1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double mul2 = scanner.nextDouble();
                result = calculator.multiplication(mul1, mul2);
                break;
            case 4:
                System.out.print("Enter dividend: ");
                double div1 = scanner.nextDouble();
                System.out.print("Enter divisor: ");
                double div2 = scanner.nextDouble();
                try {
                    result = calculator.division(div1, div2);
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            case 0:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("Result: " + result);
    }
}
