package stringmethods;

public class SubStringDemo {

	public static void main(String[] args) {

		//--------------0123456789012345
		String string = "This is a string";

		// substring with a start and an end
		String sub = string.substring (5, 7);
		System.out.println(sub);
		
		
		// substring with just a start
		String sub1 = string.substring(5);
		System.out.println(sub1);

		//==============-0123456789012
		String filename = "someimage.jpg";
		int lastDot = filename.lastIndexOf (".");

		String ext = filename.substring (filename.lastIndexOf (" .") + 1);

	}

}
