package strings;

public class StringMethods {
	
	public static void main(String[] args){
		
		String str1 ="Edy Garcia";
		
		System.out.println(str1.startsWith("Ed"));
		System.out.println(str1.startsWith("ed"));
		System.out.println(str1.startsWith("Gar", 4));
		System.out.println(str1.endsWith("cia"));
		System.out.println(str1.charAt(6));

		for(int i = 0; i<str1.length(); i++);

//		System.out.println(str1.charAt(i));
		
		String str2 = "www.Google.com";
		System.out.println(str2.indexOf('.', 4));
		//Finding a Character in a String
		System.out.println(str2.indexOf("Google"));
		System.out.println(str2.lastIndexOf("."));

		System.out.println("The length of the string is " + str2.length());
		
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		//String Concatenation

		String firstName = "Edy ";
		String lastName = "Garcia";
		System.out.println(firstName + lastName);
		System.out.println(firstName.concat(lastName));
		
		
		String str3 ="Georgia";
		String str4 ="georgia";
		
		System.out.println(str1.equals(str2));
		
		// Strings regular expressions
		
		String str5 = "Water";
		String str6 = "Water";
		
	}
}
