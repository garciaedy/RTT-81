package pa303_7_1_pa_array;

import java.util.Arrays;

public class PA303_7_1_Arrays {

	public static void main(String[] args) {
		/*Task 1: Write a program that creates an array of integers with a length of 3. 
		Assign the values 1, 2, and 3 to the indexes. Print out each array element.*/
	    int[] numbers = new int[3];

  
        numbers[0] = 1;  
        numbers[1] = 2;  
        numbers[2] = 3; 

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
				
		/* Task 2: Write a program that returns the middle element in an array. 
		 Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
		*/
        //Initialize the array with specific values
        int[] numbers2 = {13, 5, 7, 68, 2};

        // Calculate the middle index of the array
        int middleIndex = numbers2.length / 2;

        // Get the middle element using the calculated index
        int middleValue = numbers2[middleIndex];

        // Display the result
        System.out.println("The middle element is: " + middleValue);
    
				
				
		/* Task 3: Write a program that creates an array of String type and initializes it with the strings “red,” “green,”
		 *  “blue,” and “yellow.” Print out the array length. Make a copy using the clone( ) method. Use the Arrays.toString( ) 
		 *  method on the new array to verify that the original array was copied.
		*/
     // Initialize the array with specific colors
        String[] colors3 = {"red", "green", "blue", "yellow"};

        //Print out the length of the array
        System.out.println("Array length: " + colors3.length);

        // Make a copy of the array using the clone() method
        String[] copiedColors = colors3.clone();

        // Verify and display the copied array using Arrays.toString() method
        System.out.println("clone array: " + Arrays.toString(copiedColors));
        
			
				
		/*Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers). 
		 * The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index.
		 *  Now try printing the value at index = length (e.g., myArray[myArray.length] ).  Notice the type of exception which is produced.
		 *  Now try to assign a value to the array index 5. You should get the same type of exception.
		 */

        int[] numbers4 = {1, 2, 3, 4, 5};

        // 2. Print the value at the first index.
        System.out.println("Value at first index: " + numbers4[0]);

        // 3. Print the value at the last index.
        System.out.println("Value at last index: " + numbers4[numbers4.length - 1]);

        // 4. This line will cause an exception as it tries to print a non-existent element.
        System.out.println("Trying to access out of bounds element: " + numbers4[numbers4.length]);

        // 5. This line will also cause an exception as it tries to assign a value to a non-existent index.
        numbers4[5] = 6;
    
				
		/*Task 5: Write a program where you create an integer array with a length of 5. 
		 * Loop through the array and assign the value of the loop control variable (e.g., i) 
		 * to the corresponding index in the array.
		 */
				
        int[] number5 = new int[5];

        // Step 2: Loop through the array.
        for (int i = 0; i < number5.length; i++) {
            // Assign the value of the loop control variable (i) to the corresponding index in the array.
            number5[i] = i;

            // Print the value to see the assignment. (This step is optional, but useful for visual verification.)
            System.out.println("numbers[" + i + "] = " + number5[i]);
        }
				
		/*Task 6: Write a program where you create an integer array of 5 numbers. 
		 * Loop through the array and assign the value of the loop control variable multiplied 
		 * by 2 to the corresponding index in the array.
		 */
			
				
		/* Task 7: Write a program where you create an array of 5 elements. 
		 * Loop through the array and print the value of each element, except for the middle (index 2) element.
		*/
				
				
		/*	Task 8: Write a program that creates a String array of 5 elements 
		 * and swaps the first element with the middle element without creating a new array.
		 */
				
		/*	Task 9: Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. 
		 * Print the array in ascending order, and print the smallest and the largest element of the array. 
		 * The output will look like the following:
		   Array in ascending order: 0, 1, 2, 4, 9, 13
		   The smallest number is 0
		    The biggest number is 13 
		*/
		
		/* 		Task 10: Create an array that includes an integer, 3 strings, and 1 double. Print the array.*/
				
		/* Task 11: Write some Java code that asks the user how many favorite things they have.
		 *  Based on their answer, you should create a String array of the correct size. 
		 *  Then ask the user to enter the things and store them in the array you created. Finally, print out the contents of the array.
		
				Example
				How many favorite things do you have?
						7
		
						Enter your thing: phone
						Enter your thing: tv
						Enter your thing: xbox
						Enter your thing: wine
						Enter your thing: beer
						Enter your thing: sofa
						Enter your thing: book
						Your favorite  things are:
						phone tv xbox wine beer sofa book */

		

	

	}

}
