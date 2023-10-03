package calc;

import java.util.Scanner;

public class CalculatorTwo {

    public static void main(String[] args) {
        CalculatorTwo.menu();
    }

    public static void menu() {
        System.out.println("What is your number?");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        scan.nextLine();
        System.out.println("What is your second number?");
        double b = scan.nextDouble();
        scan.nextLine();
        System.out.println("Do you want to + - / or * ?");
        String math = scan.nextLine();
        double result = 0;
        boolean validOperation = true;
        switch(math) {
            case "+": result = plus(a, b); break;
            case "-": result = minus(a, b); break;
            case "/": 
                if (b != 0) {
                    result = divby(a, b); 
                } else {
                    System.out.println("Cannot divide by zero.");
                    validOperation = false;
                }
                break;
            case "*": result = times(a, b); break;
            default: 
                System.out.println("You messed up somewhere, try again");
                validOperation = false;
                break;
        }

        if (validOperation) {
            System.out.println(result);
        }

        scan.close();
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double plus(double a, double b) {
        return a + b;
    }

    public static double times(double a, double b) {
        return a * b;
    }

    public static double divby(double a, double b) {
        return a / b;
    }
}
