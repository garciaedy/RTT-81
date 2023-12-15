package methods;

public class MethodDos {
	public static void main(String[] args) {
		welcome();
		multiply(12,23);
		multiply(23, 43);
		devide(32, 2);
		devide(43 ,4);


		int x = 3;
		int y = 4;
		int z = add(x, y);
		System.out.println(z);

	}

	public static void welcome() {
		System.out.println("Welcome to our Calculator");
	}
	public static void multiply(int a, int b) {
		System.out.println(a*b);

	}
	public static void devide(float a, float b) {
		System.out.println(a/b);
	}

	static int add(int x, int y) {
		int z = x +y;
		return z;
	}
}
