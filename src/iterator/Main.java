package iterator;

import iterator.model.EmployeeDatabase;
import iterator.model.EmployeeIterator;

public class Main {

	public Main() {
		/*
		 * Iterator is a behavioral design pattern that lets you traverse elements 
		 * of a collection without exposing its underlying representation.
		 * */
		
		EmployeeDatabase db = new EmployeeDatabase();
		EmployeeIterator iter = db.createIterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next().toString());
		}
	}

	public static void main(String[] args) {
		new Main();
	}

}
