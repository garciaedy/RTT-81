package arrays;

import java.util.Arrays;

public class AdvancedArrays {

	public static void main(String[] args) {

		double [] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5 };


		// find the minimum and maximum values of the array
		double min = numbers [0];
		double max = numbers [0];


		for ( double number : numbers) {
			if ( number < min ) {
				min = number;
			}
			if ( number > max ) {
				max = number;
			}
		}
		System.out.println ("min = " + min);
		System.out.println ("max = " + max);




		String [] strings = {"one", "two", "three" };

		//String is immutable so toUpperCAse does NOT modify the String
		String str1 ="abc";
		str1.toUpperCase();


		// Array library WILL modify the array
		Arrays.sort (strings);
		System.out.println(Arrays.toString (strings));


	}

}
