package state;

public class OrderTransitState extends State{

	public OrderTransitState(Shipment shipment) {
		super(shipment);
		System.out.println("Order: " + shipment.getOrderId() + " is on the way");
	}

	@Override
	public void changeState() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		shipment.setOrderState(new OrderDeliveredState(shipment));
	}

}
