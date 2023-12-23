package template_method;

public abstract class BeverageTemplate {

	public void boilWater() {
		System.out.println("Boiling Water....");
	}
	
	public void pourInCup() {
		System.out.println("Pouring into cup...");
	}
	
	public abstract void brew();
	public abstract void addCondiments();
	
	public void prepareBeverage() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

}
