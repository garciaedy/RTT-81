package scanner;
import java.util.Scanner;

public class JavaScanner {

	public static void main(String[] args) {

		//declare an object
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		// create a variable to store the word .next get the first word 
		String name = scan.next();
		
		
		
		System.out.println("what is your age");
		int age =scan.nextInt();
		
//		System.out.println("Your name is: " + name + "and you are" + age +"Years old");
		
		
		System.out.print("what is your senior quote?");
		//. next grabs the first word of the quote 
		String quote = scan.next();
		// get the rest of the line 
		quote += scan.nextLine();
		
		System.out.println("Thank you " + name + ", you are  " + age + " years old");
		System.out.println("and your senior quote is " + quote);
		
	}

}
