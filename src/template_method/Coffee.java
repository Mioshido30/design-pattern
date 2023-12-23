package template_method;

public class Coffee extends BeverageTemplate{

	@Override
	public void brew() {
		System.out.println("Brewing the Coffee grounds....");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding sugar and milk....");
	}

}
