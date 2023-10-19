package abstract_factory.factory;

import abstract_factory.model.Desktop;
import abstract_factory.model.Smartphone;

public interface GadgetFactory {

	public Desktop createDesktop();
	public Smartphone createSmartphone();
}
