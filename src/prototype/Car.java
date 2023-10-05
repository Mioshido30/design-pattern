package prototype;

public class Car implements Cloneable{

	private String type;
	private Integer code;
	
	public Car(String type, Integer code) {
		super();
		this.type = type;
		this.code = code;
	}
	
	@Override
	public Car clone() {
		try {
			return (Car) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
	
}
