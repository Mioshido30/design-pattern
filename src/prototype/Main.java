package prototype;

public class Main {

	/*
	 * Prototype is a creational design pattern that lets you copy
	 * existing objects without making your code dependent on their classes.
	 * */
	
	public Main() {
		Car car1 = new Car("Toyota",123);
		Car car2 = car1.clone();
		
		System.out.println(car1.getType() + " " + car1.getCode());
		System.out.println(car2.getType() + " " + car2.getCode());
	}

	public static void main(String[] args) {
		new Main();
	}

}
