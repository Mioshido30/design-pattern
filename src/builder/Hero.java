package builder;

public class Hero {

	private String name;
	private String element;
	private Integer star;
	private String gender;
	
	public Hero() {}
	
	public Hero(String name, String element, Integer star, String gender) {
		super();
		this.name = name;
		this.element = element;
		this.star = star;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public Integer getStar() {
		return star;
	}

	public void setStar(Integer star) {
		this.star = star;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void printData() {
		if(this.name != null) System.out.println(this.name);
		if(this.element != null) System.out.println(this.element);
		if(this.star != null) System.out.println(this.star);
		if(this.gender != null) System.out.println(this.gender);
	}

}
