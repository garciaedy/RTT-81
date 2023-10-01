package conditionalstaments;
import java.util.Scanner;


public class DayofWeek {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the day numer");
		int day=scanner.nextInt();
		
		if(day==1) {
			System.out.println("The day is Monday ");

		}else if(day ==2){
			System.out.println("The day is Tuesday ");

		}else if(day ==3){
			System.out.println("The day is Wednesday ");

		}else if(day ==4){
			System.out.println("The day is Thurday ");

		}else if(day ==5){
			System.out.println("The day is Friday ");

		}else if(day ==2){
			System.out.println("The day is Saturday ");

		}else if(day ==2){
			System.out.println("The day is Sunday ");

		}else {
			System.out.println("The day is does not exist");
		}
		
		
		
		
		
		
		
		
	
	}

}
