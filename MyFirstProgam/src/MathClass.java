import java.util.Scanner;
public class MathClass {

	public static void main(String[] args) {
		
//		double x = 3.14;
//		double y = -10;
//		double w = 25;
//		
//		double z = Math.max(x, y);
//		double m = Math.min(x, y);
//		double a = Math.abs(y);
//		double s = Math.sqrt(w);
//		double r = Math.round(x);
//		
//		System.out.println(z);
//		System.out.println(m);
//		System.out.println(a);
//		System.out.println(s);
//		System.out.println(r);
		
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Eneter side x: ");
		x = scanner.nextDouble();
		System.out.println("Eneter side y: ");
		y = scanner.nextDouble();
		
		
		z = Math.sqrt((x*x) + (y*y));
		
		System.out.println("The hypotenuse is :" + " "+ z);
		
		scanner.close();



	}

}
