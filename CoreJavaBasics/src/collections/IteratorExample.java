package collections;

import java.util.ArrayList;

public class IteratorExample {

	public static void main(String[] args) {


		// pos 012345
		// val abcdef

		ArrayList<String> strings = new ArrayList<>();

		strings.add("one");
		strings.add("two");
		strings.add("three");

		for (String string : strings) {
			System.out.println(string);
		}

		System.out.println("_______==================_______");

		for (String string : strings) {
			System.out.println(string);
		}

	}

}
