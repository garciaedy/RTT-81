package mathclass;
import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		//Given a radius r, compute the area of a circle. Use Math.PI for the value of π.
		// This program calculates the area of a circle using the formula Area = 2 Area=πr 2 . 
		//It uses Math.PI to get the value of π.



		Scanner scanner =new Scanner(System.in);


		System.out.println("Enter the radius: ");
		double radius = scanner.nextDouble();
		
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Area of the circle: " + area);

//        double radius = 5.0; // You can change this value
//        double area = Math.PI * Math.pow(radius, 2);
//        System.out.println("Area of the circle: " + area);

	}

}
