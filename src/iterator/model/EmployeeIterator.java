package iterator.model;

import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeIterator implements Iterator<Employee>{

	private LinkedList<Employee> employees;
	private int position;
	
	public EmployeeIterator(LinkedList<Employee> employees) {
		super();
		this.employees = employees;
		this.position = 0;
	}

	@Override
	public boolean hasNext() {
		if(position == employees.size()) {			
			return false;
		}
		return true;
	}

	@Override
	public Employee next() {
		return employees.get(position++);
	}

}
