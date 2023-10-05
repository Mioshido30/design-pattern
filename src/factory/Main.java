package factory;

import java.util.Scanner;

public class Main {

	/*
	 * Factory Method is a creational design pattern that provides an interface for creating objects 
	 * in a superclass, but allows subclasses to alter the type of objects that will be created.
	 * */
	
	public Main() {
		
		
		PhoneFactory factory;
		Phone newPhone;
		
		System.out.print("Input Phone name: ");
		Scanner scan = new Scanner(System.in);
		
		String phoneType = "";
		
		phoneType = scan.nextLine();
		if(phoneType.equals("Samsung")) {
			factory = new SamsungFactory();
		} else {
			factory = new IPhoneFactory();
		}
		
		newPhone = factory.createNewPhone();
		newPhone.call();
	}

	public static void main(String[] args) {
		new Main();
	}

}
