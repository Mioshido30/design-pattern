package state;

public class OrderProcessState extends State{

	public OrderProcessState(Shipment shipment) {
		super(shipment);
		System.out.println("Order: " + shipment.getOrderId() + " is being process");
	}

	@Override
	public void changeState() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		shipment.setOrderState(new OrderTransitState(shipment));
	}


}
