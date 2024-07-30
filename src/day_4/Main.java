package day_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CalculatorMenu calculatorMenu = new CalculatorWithMenu();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            calculatorMenu.displayMenu();
            choice = scanner.nextInt();
            calculatorMenu.executeOperation(choice);
        } while (choice != 0);

        scanner.close();
    }
}