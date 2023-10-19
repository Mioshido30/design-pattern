package abstract_factory.factory;

import abstract_factory.model.*;

public class AppleFactory implements GadgetFactory {

	@Override
	public Desktop createDesktop() {
		return new Macbook();
	}

	@Override
	public Smartphone createSmartphone() {
		return new IPhone();
	}

}
