package builder;

public class HeroBuilder implements Builder {

	private Hero newHero;
	
	public HeroBuilder() {
	}

	@Override
	public Builder reset() {
		newHero = new Hero();
		return this;
	}

	@Override
	public Builder setName(String name) {
		newHero.setName(name);
		return this;
	}

	@Override
	public Builder setElement(String element) {
		newHero.setElement(element);
		return this;
	}

	@Override
	public Builder setStar(Integer star) {
		newHero.setStar(star);
		return this;
	}

	@Override
	public Builder setGender(String gender) {
		newHero.setGender(gender);
		return this;
	}

	@Override
	public Hero build() {
		return newHero;
	}

}
