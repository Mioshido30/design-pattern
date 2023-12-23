package observer.subscriber;

import observer.subject.Promo;

public class PremiumCustomer extends Customer {

	public PremiumCustomer(String customerName) {
		super(customerName);
		this.customerType = "Premium Customer";
	}

	@Override
	public void update(Promo promo, int customertype) {
		if(customertype == 1 || customertype == 2) {
			this.promo = promo;
		}
	}

}
