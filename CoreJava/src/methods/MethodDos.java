package methods;

public class MethodDos {
	public static void main(String[] args) {
		welcome();
		multiply(12,23);
		multiply(23, 43);
		devide(32, 2);
		devide(43 ,4);
		
	}
	
	public static void welcome() {
		System.out.println("Welcome to out Calculator");
	}
	public static void multiply(int a, int b) {
		System.out.println(a*b);
		
	}
	public static void devide(float a, float b) {
		System.out.println(a/b);
	}
}
