package observer;

import java.util.Scanner;

import observer.publisher.Store;
import observer.subject.Promo;
import observer.subscriber.Observer;
import observer.subscriber.PremiumCustomer;
import observer.subscriber.StandardCustomer;

public class Main {

	/*
	 * Observer is a behavioral design pattern that lets you define 
	 * a subscription mechanism to notify multiple objects about any 
	 * events that happen to the object they’re observing.
	 * */
	
	Scanner scan = new Scanner(System.in);
	Store store = new Store();
	
	public Main() {
		int input = -1;
		
		do {
			System.out.println("1. Add customer");
			System.out.println("2. View CUstomer");
			System.out.println("3. Notify Customer");
			System.out.println("4. Exit");
			System.out.print(">> ");
			
			input = scan.nextInt();
			scan.nextLine();
			
			
			if(input == 1) {
				addCustomer();
			} else if(input == 2) {
				viewCustomer();
			} else if(input == 3) {
				notifyCustomer();
			}
			
		} while (input != 4);
	}

	private void addCustomer() {
		String name;
		int type;
		
		System.out.print("Input username: ");
		name = scan.nextLine();
		
		System.out.print("Input type (0 for standard | 1 for premium): ");
		type = scan.nextInt(); scan.nextLine();
		
		Observer customer;
		
		if(type == 0) {
			customer = new StandardCustomer(name);
			store.addCustomer(customer);
		} else if(type == 1) {
			customer = new PremiumCustomer(name);
			store.addCustomer(customer);
		}
		
	}
	
	public void viewCustomer() {
		store.viewCustomer();
	}
	
	public void notifyCustomer() {
		String header;
		
		System.out.print("Input promo header: ");
		header = scan.nextLine();
		
		String content;
		System.out.print("Input promo content: ");
		
		content = scan.nextLine();
		
		Promo promo = new Promo(header, content);
		
		int customerType;
		System.out.print("Input Customer Type ([0] Standard | [1] Premium | [2] All): ");
		customerType = scan.nextInt();
		scan.nextLine();
		
		store.notifyCustomer(promo, customerType);
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
