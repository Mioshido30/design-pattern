package adapter;

import adapter.model.*;
import adapter.model.Lightning;
import adapter.model.TypeC;

public class Main {

	/*
	 * Adapter is a structural design pattern that allows 
	 * objects with incompatible interfaces to collaborate.
	 * */
	
	public Main() {
		Smartphone sp = new Smartphone("samsung");
		TypeC TC = new TypeC();
		Lightning ln = new Lightning();
		
		System.out.println("Battery" + sp.getBatteryPercentage());
		
		sp.play();
		System.out.println("Battery" + sp.getBatteryPercentage());

//		sp.charge(TC);
//		System.out.println("Battery" + sp.getBatteryPercentage());
		
		
		ChargerAdapter ca = new ChargerAdapter();
		sp.charge(ca);
		System.out.println("Battery" + sp.getBatteryPercentage());
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
