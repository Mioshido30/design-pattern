package template_method;

import java.util.Scanner;

public class Main {

	/*
	 * Template Method is a behavioral design pattern that defines the skeleton 
	 * of an algorithm in the superclass but lets subclasses override specific 
	 * steps of the algorithm without changing its structure.
	 * */
	
	Scanner scan = new Scanner(System.in);
	
	public Main() {
		
		int input = -1;
		
		do {
			System.out.println("1. Coffee");
			System.out.println("2. Tea");
			System.out.println("3. Exit");
			System.out.print(">> ");
			input = scan.nextInt();
			scan.nextLine();
			
			if(input == 1) {
				BeverageTemplate coffee = new Coffee();
				coffee.prepareBeverage();
			} else if(input == 2) {
				BeverageTemplate tea = new Tea();
				tea.prepareBeverage();
			}
		} while (input != 3);
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
