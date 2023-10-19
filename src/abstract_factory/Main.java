package abstract_factory;

import abstract_factory.factory.AppleFactory;
import abstract_factory.factory.HuaweiFactory;
import abstract_factory.model.GadgetStore;

public class Main {

	/*
	 * Abstract Factory is a creational design pattern that lets 
	 * you produce families of related objects without specifying 
	 * their concrete classes.
	 * 
	 * */
	
	public Main() {
		GadgetStore appleStore = new GadgetStore(new AppleFactory());
		GadgetStore huaweiStore = new GadgetStore(new HuaweiFactory());
		
		appleStore.display();
		huaweiStore.display();
	}

	public static void main(String[] args) {
		new Main();
	}

}
