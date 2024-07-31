package day_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CalculatorMenu calculatorMenu = new CalculatorWithMenu();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            calculatorMenu.displayMenu();
            option = scanner.nextInt();
            calculatorMenu.executeOperation(option);
        } while (option != 0);

        scanner.close();
    }
}