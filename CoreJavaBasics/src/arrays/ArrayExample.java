package arrays;

public class ArrayExample {

	public static void main(String[] args) {

		int arraySize = 10;

		// this creates a new array of type double with 20 elements ... 0 to 19
		double[] doubleArray = new double[arraySize];
		String[] stringArray = new String[arraySize];
		stringArray[1] = "one";
		stringArray[2] = "two";
		stringArray[0] = "zero";
		stringArray[8] = "eight";
		stringArray[9] = "nine";

		// this is going to fail and cause code execution to stop
		// stringArray[11] = "eleven";

		// loop over the entire array and print the value in each location
		// its important to know that you can ask an array how long it is using .length
		for (int pos = 0; pos < stringArray.length; pos++) {
			System.out.println("The value in position " + pos + " is " + stringArray[pos]);
		}

		//separating content print statement 
		System.out.println("=========================");

		// enhanced for loop
		for (String value : stringArray) {
			System.out.println("The value = " + value);
		}

		//separating content print statement 
		System.out.println("=========================");

		// write a for loop that counts the number of nulls in the array
		// after the loop completes print that number
		int nullCount = 0;
		for (String value : stringArray) {
			if (value == null) {
				nullCount = nullCount + 1;
			}
		}
		System.out.println("Number of nulls is " + nullCount);

		//separating content print statement 
		System.out.println("=========================");

		// write a for loop that tells me the location of the first null in the array
		// this is going to use the non-enhanced for loop
		int firstNull = -1;
		for (int pos = 0; pos < stringArray.length; pos++) {
			if ( stringArray[pos] == null ) {
				firstNull = pos;
				break;
			}
		}
		System.out.println("Position of the first null is " + firstNull);

		//separating content print statement 
		System.out.println("=========================");


		// write a for loop that tells me how many values are not null 
		// This is the enhanced loop

		int notNullCount = 0;
		for (String item : stringArray) {
			if (item != null) {
				notNullCount += 1;

			}
		}
		System.out.println("Count of values in the array that are not null are " + notNullCount);

		// way two this an old style of loop

		int regNotNullCount =0;

		for (int pos = 0; pos< stringArray.length; pos++) {
			if (stringArray[pos] != null) {
				regNotNullCount = regNotNullCount + 1;
			}
		}
		System.out.println("Count of values in the array that are not null are " + regNotNullCount);




		//separating content print statement 
		System.out.println("=========================");


		// 2. write a for loop that tells me the last position of null in the array
		//by last null position we mean the position with the highest value
		// way number one

		int lastNullPosition = -1;

		for(int pos = 0; pos < stringArray.length; pos++) {
			if(stringArray[pos] == null) {
				lastNullPosition = pos;
			}
		}

		if (lastNullPosition == -1) {
			System.out.println("The array does not have a null");
		} else {
			System.out.println("The last null of the array is in position" + lastNullPosition);
		}
		// way number 2

		int lastNull = -1;
		for (int pos2 = 0; pos2 < stringArray.length; pos2++) {
			if (stringArray[pos2] == null) {
				lastNull = pos2;
			}

		}
		System.out.println("Position of the last null is " + lastNull);


		//Most efficient way because it cab break the loop once it found its answer
		// starts at the end of the array and counts down to the first

		int lastNullPositionReverse = -1;

		for(int pos = stringArray.length -1; pos >= 0; pos--) {
			if (stringArray[pos] == null) {
				lastNullPositionReverse = pos;
				break;
			}
		}

		if (lastNullPositionReverse == -1) {
			System.out.println ("The array does not have a null");
		} else {
			System.out.println ("The last null of the array is in position " + lastNullPositionReverse);
		}


		//3.  write a for loop that starts at the final position in the array and counts down to the first

		for (int i = stringArray.length - 1; i >= 0; i--) {
			System.out.println("the value in position " + i + " is " + stringArray[i]);

		}


		//separating content print statement 
		System.out.println("=========================");


		//4. use letters.split(",") to make an array of letters
		// loop over the array and count the number of letters that are not vowels

		String letters = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
		//My answer 
		/*
		 //Split the string into an array using the split method, so we get each letter as a separate element in the array
		String[] lettersArray = letters.split(",");

		// Initialize a counter variable to keep track of non-vowel letters
		int nonVowelCount = 0;

		// Loop over each letter in the array
		for (String letter : lettersArray) {

			//Check if the letter is NOT a vowel (i.e., not 'a', 'e', 'i', 'o', or 'u')
			// If it's not a vowel, increment the nonVowelCount by 1
			if (!(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u"))) {
				nonVowelCount++;
			}
		}

		//  Print the number of non-vowel letters
		System.out.println("Number of non-vowels: " + nonVowelCount);
		 */


		String letters = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";

		String[] lettersArray = letters.split(",");
		int numberOfLetters = 0;
		for (int pos = 0; pos < lettersArray.length; pos++) {
			if (lettersArray[pos].equals("a")) {
				continue;
			} else if (lettersArray[pos].equals("e")) {
				continue;
			} else if (lettersArray[pos].equals("i")) {
				continue;
			} else if (lettersArray[pos].equals("o")) {
				continue;
			} else if (lettersArray[pos].equals("u")) {
				continue;
			}

			numberOfLetters = numberOfLetters + 1;
		}
		System.out.println("Number of letters = " + numberOfLetters);


		// using an enhanced loop and much less code
		String vowels = "aeiou";

		int numberOfLettersEnhanced = 0;
		for (String letter : lettersArray) {
			if (!vowels.contains(letter)) {
				numberOfLettersEnhanced = numberOfLettersEnhanced + 1;
			}
		}
		System.out.println("Number of letters enhanced = " + numberOfLettersEnhanced);


	}

}