package factory;

public class SamsungFactory implements PhoneFactory{

	@Override
	public Phone createNewPhone() {
		return new SamsungPhone();
	}

}
