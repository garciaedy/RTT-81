package classespartone;

public class Main {

	public static void main(String[] args) {

	Car car =new Car();
	car.setMake("Porche");
	car.setModel("Carrera");
	car.setConvertible(false);
	car.setColor("Navy Blue");
	
	System.out.println("make" + car.getMake());
	System.out.println("model" + car.getModel());
	
	car.describeCar(); 
	
	
	}

}
