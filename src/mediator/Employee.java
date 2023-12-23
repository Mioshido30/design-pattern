package mediator;

public class Employee {

	private String name;
	private boolean canMessage;
	private Mediator mediator;
	
	public Employee(String name, boolean canMessage, Mediator mediator) {
		super();
		this.name = name;
		this.canMessage = canMessage;
		this.mediator = mediator;
		
		if(this.canMessage) {
			this.mediator.registerEmployee(this);
		}
	}
	
	public void send(Employee receiver, String message) {
		mediator.sendMessage(this, receiver, message);
	}
	
	public void receive(Employee sender, String message) {
		System.out.println(this.getName() + " Has Receive a message from " + sender.getName() + ": " + message);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
