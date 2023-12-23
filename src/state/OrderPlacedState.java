package state;

public class OrderPlacedState extends State {

	public OrderPlacedState(Shipment shipment) {
		super(shipment);
		System.out.println("Order: " + shipment.getOrderId() + " is placed");
	}

	@Override
	public void changeState() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		shipment.setOrderState(new OrderProcessState(shipment));
		
	}

}
