package observer.subscriber;

import observer.subject.Promo;

public class StandardCustomer extends Customer {

	public StandardCustomer(String customerName) {
		super(customerName);
		this.customerType = "Standard Customer";
	}

	@Override
	public void update(Promo promo, int customertype) {
		if(customertype == 0 || customertype == 2) {
			this.promo = promo;
		}
		
	}

}
