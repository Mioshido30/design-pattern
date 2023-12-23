package mediator;

import java.util.ArrayList;

public class ChatMediator implements Mediator {

	private ArrayList<Employee> authorizhedEmployees;
	
	public ChatMediator() {
		this.authorizhedEmployees = new ArrayList<>();
	}

	@Override
	public void registerEmployee(Employee employee) {
		authorizhedEmployees.add(employee);
	}

	@Override
	public void sendMessage(Employee sender, Employee receiver, String message) {
		if(authorizhedEmployees.contains(sender) && authorizhedEmployees.contains(receiver)) {
			receiver.receive(sender, message);
		} else {
			System.out.println("Unauthorized Employee");
		}
	}

}
