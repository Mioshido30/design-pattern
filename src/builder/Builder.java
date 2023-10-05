package builder;

public interface Builder {
	
	public Builder reset();
	public Builder setName(String name);
	public Builder setElement(String element);
	public Builder setStar(Integer star);
	public Builder setGender(String gender);
	public Hero build();
	
}
