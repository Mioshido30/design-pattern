package adapter.model;

public class Smartphone {

	private String brand;
	private int batteryPercentage;
	
	public Smartphone(String brand) {
		super();
		this.brand = brand;
		this.batteryPercentage = 100;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getBatteryPercentage() {
		return batteryPercentage;
	}

	public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}
	
	public void play() {
		System.out.print("Playing with: " + brand);
		while(batteryPercentage > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(".");
			batteryPercentage -= 20;
		}
		System.out.println("");
	}
	
	public void charge(TypeC typeC) {
		System.out.print("Charging");
		while(batteryPercentage < 100) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(".");
			batteryPercentage += typeC.getChargingCapacity();
		}
		System.out.println("");
	}
	
}
