package builder;

public class Main {

	/*
	 * Builder is a creational design pattern that lets you construct complex objects step by step.
	 * */
	
	public Main() {
		// Without Builder Pattern
		Hero yelan = new Hero("Yelan","Hydro",5,"Female");
		yelan.printData();
		
		// With Builder Pattern
		HeroBuilder heroBuilder = new HeroBuilder();
		Hero hutao = heroBuilder.reset().setName("Hutao").setElement("Pyro").setGender("Female").build();
		hutao.printData();
	}

	public static void main(String[] args) {
		new Main();
	}
}
