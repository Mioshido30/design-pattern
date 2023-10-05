package singleton;

public class Main {

	/*
	 * Singleton is a creational design pattern that lets you ensure that a class has only one instance, 
	 * while providing a global access point to this instance.
	 * */
	
	public Main() {
		
		DatabaseManager db = DatabaseManager.getInstance();
		DatabaseManager db2 = DatabaseManager.getInstance();
		
		System.out.println(db);
		System.out.println(db2);
	}

	public static void main(String[] args) {
		new Main();
	}

}
