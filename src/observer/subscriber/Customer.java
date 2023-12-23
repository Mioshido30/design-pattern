package observer.subscriber;

import observer.subject.Promo;

public abstract class Customer implements Observer{

	protected String customerName;
	protected String customerType;
	protected Promo promo;
	
	public Customer(String customerName) {
		super();
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		
		if(promo == null) {
			return String.format("There is no promo for %s", customerName);
		}
		
		return String.format("%s [%s]\nPromo: %s\n", customerName, customerType, promo);
	}
	

}
