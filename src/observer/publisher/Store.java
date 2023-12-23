package observer.publisher;

import java.util.ArrayList;

import observer.subject.Promo;
import observer.subscriber.Observer;

public class Store {

	private ArrayList<Observer> customerList;
	public Store() {
		this.customerList = new ArrayList<>();
	}

	public void addCustomer(Observer customer) {
		this.customerList.add(customer);
	}
	
	public void viewCustomer() {
		if(customerList.isEmpty()) {
			System.out.println("No Customer");
		} else {
			for (Observer observer : customerList) {
				System.out.println(observer.toString());
			}
		}
	}
	
	public void notifyCustomer(Promo promo, int customertype) {
		for (Observer observer : customerList) {
			observer.update(promo, customertype);
		}
	}
}
