package calc;
import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
	/* Create a small calculator .. it will be able to do 4 operations - add, subtract, multiply and divide.
	 *   Each of these will be a single method that does that operation.    Ask the user for 2 numbers
	 *   and then ask the user which operation they want to do.   Then do that operation and print the result.
	 *   Each operation should not print its own results.   All operations should work with double values. (edited)
	So this should be a main function with probably 6 methods ( 4 operations, 1 menu, 1 input )
	each operation should take 2 parameters and return a double ...*/
Scanner scanner = new Scanner(System.in);

        // Ask user for two numbers
        System.out.println("Enter the first number:");
        double num1 = inputDouble(scanner);

        System.out.println("Enter the second number:");
        double num2 = inputDouble(scanner);

        // Display the operations menu and get the user's choice
        displayMenu();
        int choice = scanner.nextInt();


        calculationChoice(choice, num1, num2);
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double divide(double a, double b) {
        if (b == 0) {
            System.out.println(" Division by zero.");
            System.exit(0);
        }
        return a / b;
    }

    private static void displayMenu() {
        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("Enter your choice (1/2/3/4):");
    }

    private static double inputDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid number:");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    private static void calculationChoice(int choice, double num1, double num2) {
        double result = 0;
        if (choice == 1) {
            result = add(num1, num2);
        } else if (choice == 2) {
            result = subtract(num1, num2);
        } else if (choice == 3) {
            result = multiply(num1, num2);
        } else if (choice == 4) {
            result = divide(num1, num2);
        } else {
            System.out.println("Invalid choice. Exiting...");
            System.exit(0);
        }
        System.out.println("Result: " + result);
    }
}



