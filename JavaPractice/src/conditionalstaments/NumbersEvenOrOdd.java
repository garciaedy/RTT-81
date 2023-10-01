package conditionalstaments;
import java.util.Scanner;


public class NumbersEvenOrOdd {

	public static void main(String[] args) {
			Scanner scanner =new Scanner(System.in);
			
			int n;
			
			System.out.println("Enter a number");
			n =scanner.nextInt();
			
			if(n%2==0) {
				System.out.println("The number is Even");

			}else {
				System.out.println("The Number is Odd");

			}      
			scanner.close();

	}

}
