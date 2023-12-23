package observer.subscriber;

import observer.subject.Promo;

public interface Observer {
	
	// Type : Standard = 0, Premium = 1
	
	public void update(Promo promo, int customertype);
}
