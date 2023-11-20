package proxy.virtual;

public class ImageProxy implements IDisplayable {

	ImageDisplay id = null;
	String filePath;
	
	public ImageProxy(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public void displayImage() {
		if(id == null) {
			id = new ImageDisplay(filePath);
		}
		
		id.displayImage();
	}

}
