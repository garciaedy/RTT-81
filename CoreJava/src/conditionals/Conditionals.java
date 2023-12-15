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


		System.out.println(" ");
		System.out.println("_________________________________");
		System.out.println(" ");

		int age = 18;
		if(age >= 18) {
			System.out.println("youy are old enough to vote");
		}else {
			System.out.println(" You are too young");
		}

		System.out.println(" ");
		System.out.println("_________________________________");
		System.out.println(" ");

		int num =3;

		if(num % 2 ==0) {
			System.out.println("Ther number is even");

		}else {
			System.out.println("The number is odd");

		}

		// Check if a given year is a leap year


		System.out.println(" ");
		System.out.println("_________________________________");
		System.out.println(" ");

		// Determine the type of a website based on protocol and domain.

		String protocol = "https";
		String domain = ".org";
		if (protocol.equals("https")) {
			if(domain.equals(".org")) {
				System.out.print("Secure organizational website");
			}else {
				System.out.println("Secure website");
			}
		}else {
			System.out.println("Not a secure website");
		}

		System.out.println(" ");
		System.out.println("_________________________________");
		System.out.println(" ");
		// Check if a given year is a leap year


		System.out.println(" ");
		System.out.println("_________________________________");
		System.out.println(" ");




		System.out.println(" ");
		System.out.println("_________________________________");
		System.out.println(" ");




		System.out.println(" ");
		System.out.println("_________________________________");
		System.out.println(" ");




		System.out.println(" ");
		System.out.println("_________________________________");
		System.out.println(" ");




		System.out.println(" ");
		System.out.println("_________________________________");
		System.out.println(" ");




		System.out.println(" ");
		System.out.println("_________________________________");
		System.out.println(" ");






		System.out.println(" ");
		System.out.println("_________________________________");
		System.out.println(" ");
		// Command-based action determination.

		String command = "Start";
		switch(command) {
		case "Start":
		System.out.println("Starting the engine...");
		break;
		case"stop":
			System.out.println("Stopping the engine");
			break;
			default:
				System.out.println("Command not recognized");

		}



		System.out.println(" ");
		System.out.println("_________________________________");
		System.out.println(" ");





		System.out.println(" ");
		System.out.println("_________________________________");
		System.out.println(" ");




		System.out.println(" ");
		System.out.println("_________________________________");
		System.out.println(" ");




		System.out.println(" ");
		System.out.println("_________________________________");
		System.out.println(" ");



		System.out.println(" ");
		System.out.println("_________________________________");
		System.out.println(" ");

	}

}
