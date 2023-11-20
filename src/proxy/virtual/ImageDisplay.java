package proxy.virtual;

public class ImageDisplay implements IDisplayable{

	String filePath;

	public ImageDisplay(String filePath) {
		super();
		this.filePath = filePath;
		System.out.println("Processing...");
	}

	@Override
	public void displayImage() {
		System.out.println("Display image: " + filePath);
	}
	
	

}
