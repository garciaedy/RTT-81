package escapecharacters;

public class escapeCharacters {

	public static void main(String[] args) {
		
		//The main one to know are ...... \t, \n , \"
		
		// This is a tab escape character \t
			
		System.out.println(" This is a tab escape character -> \t <- ");
		
		//basic formating with tabs
		System.out.println("1\tOne\t\tCo13");
		System.out.println("10\tTen\t\tCo13");
		
		//this one is long so it only needs 1 tab for the 3rd column
		System.out.println("100\tOne Hundred\tCo13");
		
		//this is an example of a new line character n
		System.out.println("This is line 1\nThis is line 2");
		System.out. println("This is line 3");
		System.out.println ("This is line 4");
		
		// what happens if I want to print just a \
		System.out.println ("To get a slash to print we need 2 of them \\");
		
		//adding quotes to a string
		System.out.println("This a \"Quote\" ");
		
	}

}
