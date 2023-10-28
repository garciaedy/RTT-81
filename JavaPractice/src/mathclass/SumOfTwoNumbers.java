package mathclass;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {

		//This program uses the Scanner class to take two numbers as input. It then adds them and prints the result.

		Scanner scanner =new Scanner(System.in);

		System.out.println("Enter your first Number: ");
		double num1 = scanner.nextDouble();


		System.out.println("Enter your second Number: ");
		double num2 = scanner.nextDouble();

		double sum = num1 + num2;

		System.out.println("Your sum is: " + sum);

		scanner.close();


	}

}
