package forloops;

public class ForLooops {
	public static void main(String[] args) {
		
		for(int i =0; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println(" ");
		System.out.println("_________________________________");
		System.out.println(" ");
		// Sum numbers from 1 to 10

		int sum =0;
		for(int i =0; i<=10; i++) {
			sum +=i;
		}
		
		System.out.println(sum);
		
		System.out.println(" ");
		System.out.println("_________________________________");
		System.out.println(" ");
		// Print a multiplication table for 10
		for(int m=1; m<=10; m++) {
			System.out.println("10 * " + m + " = " + (10*m));
		}
		System.out.println(" ");
		System.out.println("_________________________________");
		System.out.println(" ");

		
	//	Enhanced For Loops
		String[] fruits = {"Apple", "Banana", "Cherry"};
		for(String fruit : fruits) {
			System.out.println(fruit );
		}
		
//		for(int i =0; i<fruits.length; i++) {
//			System.out.println(fruits[i]);
//		}
//		
		System.out.println(" ");
		System.out.println("_________________________________");
		System.out.println(" ");
		
		int[] numbers1 = {1, 3, 5, 7, 9};
		int sum1 = 0;
		for (int num1 : numbers1) {
		    sum1 += num1;
		}
		System.out.println("Sum: " + sum1); // Output: Sum: 25
		
//		for (int i = 0; i < numbers1.length; i++) {
//		    sum1 += numbers1[i];
//		}
//
//		System.out.println("Sum: " + sum1); // Output: Sum: 25
		
		
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

	}
}
