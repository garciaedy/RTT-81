package conditionals;

public class Conditionals {

	public static void main(String[] args) {
		
		int score = 43;
		
		
		if(score >=90) {
			System.out.println("The grade is an A");
		}else if(score >=80) {
			System.out.println("The grade is a B");
		}else if(score >= 70) {
			System.out.println("The grade is a C");
		}else if(score >=60) {
			System.out.println("The grade is a D");
		}else {
			System.out.println("the grade is an F");
		}
	}

}
