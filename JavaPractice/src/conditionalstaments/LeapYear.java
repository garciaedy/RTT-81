package conditionalstaments;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a Year number");
		int year = scanner.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("It's a Leap Year");
		} else {
			System.out.println("It's Not a Leap Year");
		}
	}
}