package template_method;

public class Tea extends BeverageTemplate{

	@Override
	public void brew() {
		System.out.println("Steeping the tea...");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding lemon...");
	}

	

}
