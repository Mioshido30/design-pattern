package state;

public class OrderDeliveredState extends State{

	public OrderDeliveredState(Shipment shipment) {
		super(shipment);
		System.out.println("Order: " + shipment.getOrderId() + " is delivered");
	}

	@Override
	public void changeState() {
		shipment.setOrderState(null);
	}


}
