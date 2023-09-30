package mathclass;

public class MathClass {

	public static void main(String[] args) {
		double x = 3.14;
		double y = -10;
		double sqrt = 25;
		double round = 23.19;
		double ceil = 24.56;
		double flooor = 49.31;
		
		
		
		double max =	Math.max(x, y);
		double min =  Math.min(x, y);
		double absolute = Math.abs(y);
		double squareRoot = Math.sqrt(sqrt);
		double rounding =Math.round(round);
		double ceiling = Math.ceil(ceil);
		double roundDown = Math.floor(flooor);
		
		
		System.out.println(min);
		System.out.println(max);
		System.out.println(absolute);
		System.out.println(squareRoot);
		System.out.println(rounding);
		System.out.println(ceiling);
		System.out.println(roundDown);
//		System.out.println();
//		System.out.println();
	}

}
