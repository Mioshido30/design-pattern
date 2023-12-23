package observer.subject;

public class Promo {

	protected String promoHeader;
	protected String promoContent;
	
	public Promo(String promoHeader, String promoContent) {
		super();
		this.promoHeader = promoHeader;
		this.promoContent = promoContent;
	}
	
	@Override
	public String toString() {
		
		return String.format("[ %s ]\n%s", promoHeader, promoContent);
	}

}
