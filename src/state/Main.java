package state;

import java.util.Scanner;

public class Main {

	/*
	 * State is a behavioral design pattern that lets an object
	 * alter its behavior when its internal state changes. 
	 * It appears as if the object changed its class.
	 * */
	
	Scanner scan = new Scanner(System.in);
	
	public Main() {
		
		int input = -1;
		
		do {
			System.out.println("1. Start");
			System.out.println("2. Exit");
			System.out.print(">> ");
			
			input = scan.nextInt();
			scan.nextLine();
			
			if(input == 1) {
				String orderId;
				
				System.out.print("OrderID >>");
				orderId = scan.nextLine();
				
				Shipment shipmentObj = new Shipment(orderId);
				
				if(shipmentObj.getOrderState() instanceof OrderPlacedState) {
					do {
						shipmentObj.getOrderState().changeState();
					} while (shipmentObj.getOrderState() instanceof OrderDeliveredState == false);
				}
			} 
		} while (input != 2);
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
