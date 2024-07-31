package day_1;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Exercise 1:
        String myName = "Will";
        String myLastName = "Ocanto";
        int myAge = 28;
        System.out.println("Hi, my name is " + myName + " " + myLastName + " and i have " + myAge + " years old");

        //Exercise 2:
        welcomeMessage();

        //Exercise 3:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        int thirdNum = sc.nextInt();

        if (firstNum > secondNum && firstNum > thirdNum) {
            System.out.println("The first number: " + firstNum + " is the largest number");
        } else if (secondNum > firstNum && secondNum > thirdNum) {
            System.out.println("The second number: " + secondNum + " is the largest number");
        } else if (thirdNum > firstNum && thirdNum > secondNum) {
            System.out.println("The third number: " + thirdNum + " is the largest number");
        } else if (firstNum == secondNum && firstNum > thirdNum) {
            System.out.println("The first number: " + firstNum + " and the second number:" + secondNum + " are the largest numbers");
        } else if (firstNum == thirdNum && firstNum > secondNum) {
            System.out.println("The first number: " + firstNum + " and the third number: " + thirdNum + " are the largest numbers");
        } else if (secondNum > firstNum) {
            System.out.println("The second number " + secondNum + " and the third number: " + thirdNum + " are the largest numbers");
        } else {
            System.out.println("All the numbers are the same");
        }

        //Exercise 4:
        System.out.println("Enter a number");
        int enterNumber = sc.nextInt();
        if (enterNumber % 2 == 0) {
            System.out.println("The number entered is even");
        } else {
            System.out.println("The number entered is odd");
        }

        //Exercise 5:
        System.out.println("Enter two words");
        String firstWord = sc.next();
        String secondWord = sc.next();

        if (Objects.equals(firstWord, secondWord)) {
            System.out.println("Both words are the same");
        } else {
            System.out.println("The words are different");
        }

        //Exercise 6:
        primeNumber(79);

        //Exercise 7:
        int[] arrayNumb = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(numbersOdd(arrayNumb));

        //Exercise 8:
        numbersOddAndPrimes(arrayNumb);

        //Exercise 9:
        calculatorMenu();

        //Exercise 10:
        makingCalculator();


    }

    public static void welcomeMessage() {
        System.out.println("Welcome to our page");
    }

    public static void primeNumber(int num) {
        if (num <= 1) {
            System.out.println("The number " + num + " is not prime");
            return;
        }

        int testNum = num;
        int i;
        int factorPrimo = 1;

        for (i = 2; i <= num; ) {
            if (testNum % i == 0) {
                factorPrimo = i;
                testNum /= factorPrimo;
            } else {
                i++;
            }
        }
        if (factorPrimo == num) {
            System.out.println("The number " + num + " is prime");
        } else {
            System.out.println("The number " + num + " is not prime");
        }

    }

    public static int numbersOdd(int[] array) {
        int sumOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sumOdd += array[i];
            }
        }
        return sumOdd;
    }

    public static boolean primeNumber2(int num) {
        if (num <= 1) {
            return false;
        }

        int testNum = num;
        int i;
        int factorPrimo = 1;

        for (i = 2; i <= num; ) {
            if (testNum % i == 0) {
                factorPrimo = i;
                testNum /= factorPrimo;
            } else {
                i++;
            }
        }
        if (factorPrimo == num) {
            return true;
        }

        return false;
    }

    public static void numbersOddAndPrimes(int[] array) {
        int sumPrime = 0;

        for (int number : array) {
            if (number % 2 == 0) System.out.println("Number pair: " + number);
        }
        for (int number : array) {
            if (primeNumber2(number)) {
                sumPrime += number;
            }
        }
        System.out.println("the sum of the prime numbers is: " + sumPrime);
    }

    public static void calculatorMenu() {
        System.out.println("Please, enter a number to select a type of operation: (1)addition (2)subtraction (3)multiplication (4)division (0)exit");
        Scanner sc2 = new Scanner(System.in);
        int option = sc2.nextInt();
        switch (option) {
            case 0:
                System.out.println("Exiting the calculator");
                break;
            case 1:
                System.out.println("The operation selected is addition");
                break;
            case 2:
                System.out.println("The operation selected is subtraction");
                break;
            case 3:
                System.out.println("The operation selected is multiplication");
                break;
            case 4:
                System.out.println("The operation selected is division");
                break;
            default:
                System.out.println("invalid option");
        }
    }

    public static void makingCalculator() {
        Scanner enterNumber = new Scanner(System.in);

        System.out.println("Please, enter a number to select a type of operation: (1)addition (2)subtraction (3)multiplication (4)division (0)exit");
        int option = enterNumber.nextInt();

        int result = 0;
        if (option==0){
            System.out.println("Exiting the calculator");
        }else{
            System.out.println("Enter the first operand");
            int firstOperand = enterNumber.nextInt();
            System.out.println("Enter the second operand");
            int secondOperand = enterNumber.nextInt();
            switch (option) {
                case 1:
                    result = firstOperand + secondOperand;
                    System.out.println("The sum of " + firstOperand + " and " + secondOperand + " is: " + result);
                    break;
                case 2:
                    result = firstOperand - secondOperand;
                    System.out.println("The subtraction of " + firstOperand + " and " + secondOperand + " is: " + result);
                    break;
                case 3:
                    result = firstOperand * secondOperand;
                    System.out.println("The multiplication of " + firstOperand + " and " + secondOperand + " is: " + result);
                    break;
                case 4:
                    if (secondOperand == 0) {
                        System.out.println("Cannot be divided by zero");
                    } else {
                        result = firstOperand / secondOperand;
                        System.out.println("The division of " + firstOperand + " and " + secondOperand + " is: " + result);
                    }
                    break;
                default:
                    System.out.println("invalid option");
            }
        }

    }

}
