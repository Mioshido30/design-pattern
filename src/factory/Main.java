package factory;

import java.util.Scanner;

public class Main {

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
