package adapter.model;

public class ChargerAdapter extends TypeC{

	private Lightning lightning;
	
	public ChargerAdapter() {
		lightning = new Lightning();
	}
	
	@Override
	public int getChargingCapacity() {
		return this.lightning.getChargingCapacity();
	}
}
