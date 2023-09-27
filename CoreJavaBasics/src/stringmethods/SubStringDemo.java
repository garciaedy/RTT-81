package stringmethods;

public class SubStringDemo {

	public static void main(String[] args) {

		// --------------0123456789012345
				String string = "This is a string";
				
				// substring with a start and an end
				String sub = string.substring(5, 7);
				System.out.println(sub);
				
				// substring with just a start
				String sub1 = string.substring(5);
				System.out.println(sub1);
				
				// ----------------0123456789012
				String filename = "someimage.jpg";
				
				int lastDot = filename.lastIndexOf(".");
				
				String ext = filename.substring(filename.lastIndexOf(".") + 1);
				System.out.println(ext);
				
				// ------------01234567890
				String name = "Eric Heilig";
				
				int spacePosition = name.indexOf(" ");
				String firstname = name.substring(0, spacePosition);
				System.out.println(firstname);
				
				String lastname = name.substring(name.indexOf(" ") + 1);
				System.out.println(lastname);
				
				
				// find the position of the first space in the string
				String example = "This is an example";
				int firstPosition = example.indexOf(' ');

		        // Display the result.
		        
		        // Check if the first space position is not -1.
		        // If it's not -1, then it means a space exists in the string.
		        if (firstPosition != -1) {
		            System.out.println("The position of the first space is: " + firstPosition);
		        } else {
		            // If the returned position is -1, it means the string does not contain any spaces.
		            System.out.println("There is no space in the string.");
		        }
		        
		        
				// find the position of the last space in the string
				// substring of the characters between the first and last space of the string
				
				
				// do the same thing to find the substring of the first and last vowel of the string
			
				
				// use the string.charAt function and use a for loop to loop over the entire string
				// and print out each character with a new line after it.
				// you need to use the string.length() function also
				
				// using only indexOf(" ") print the substring that contains the word "is"
				// use 2 substrings to do this.
				
				
				// https://edabit.com/challenges
				// Change to Java / Very Easy or Easy / Strings and try to do some of them
				
			}

		}