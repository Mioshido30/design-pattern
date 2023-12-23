package mediator;

public interface Mediator {
	public void registerEmployee(Employee employee);
	public void sendMessage(Employee sender, Employee receiver, String message);
	
}
