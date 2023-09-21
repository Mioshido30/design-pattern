package factory;

public class IPhoneFactory implements PhoneFactory{

	@Override
	public Phone createNewPhone() {
		return new IPhone();
	}

	

}
