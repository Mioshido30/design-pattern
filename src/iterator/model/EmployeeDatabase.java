package iterator.model;

import java.util.LinkedList;

public class EmployeeDatabase implements Iterable {

	private LinkedList<Employee> employeeList;
	
	public EmployeeDatabase() {
		super();
		
		this.employeeList = new LinkedList<>();
		employeeList.add(new Employee("Shido", 3000000));
		employeeList.add(new Employee("Shido 2", 4000000));
		employeeList.add(new Employee("Shido 3", 5000000));
		employeeList.add(new Employee("Shido 4", 6000000));
		
	}

	@Override
	public EmployeeIterator createIterator() {
		return new EmployeeIterator(employeeList);
	}

}
