package state;

public class Shipment {

	private String orderId;
	private State orderState;
	
	public Shipment(String orderId) {
		super();
		this.orderId = orderId;
		this.orderState = new OrderPlacedState(this);
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public State getOrderState() {
		return orderState;
	}

	public void setOrderState(State orderState) {
		this.orderState = orderState;
	}	

}
