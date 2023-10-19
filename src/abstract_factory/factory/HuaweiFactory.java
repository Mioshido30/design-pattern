package abstract_factory.factory;

import abstract_factory.model.*;

public class HuaweiFactory implements GadgetFactory {

	@Override
	public Desktop createDesktop() {
		return new HuaweiMatebook();
	}

	@Override
	public Smartphone createSmartphone() {
		return new HuaweiSmartphone();
	}

}
