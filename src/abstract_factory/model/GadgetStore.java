package abstract_factory.model;

import abstract_factory.factory.GadgetFactory;

public class GadgetStore {

	GadgetFactory factory;
	Desktop desktop;
	Smartphone smartphone;
	
	public GadgetStore(GadgetFactory factory) {
		this.factory = factory;
	}
	
	public void display() {
		desktop = factory.createDesktop();
		System.out.println(desktop.getType());

		smartphone = factory.createSmartphone();
		System.out.println(smartphone.getType());
	}
}
