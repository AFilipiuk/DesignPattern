package decorator;

public class Soy extends CondimentDecorator {
	Beverage bevarage;
	
	public Soy(Beverage bevarage) {
		this.bevarage = bevarage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return bevarage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .15 + bevarage.cost();
	}

}
