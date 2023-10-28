package collections;
import java.util.HashSet;


public class SetDemo {

	public static void main(String[] args) {

		HashSet<String> stringSet = new HashSet<>();

		stringSet.add("a");
		stringSet.add("b");
		stringSet.add("c");

		stringSet.add("a");


		for(String string : stringSet) {
			System.out.println(string);
		}



	}

}
