package state;

public abstract class State {

	protected Shipment shipment;

	public State(Shipment shipment) {
		super();
		this.shipment = shipment;
	}
	
	public abstract void changeState();

}
