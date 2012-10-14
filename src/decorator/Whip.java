package decorator;

public class Whip extends CondimentDecorator {
	Beverage bevarage;
	
	public Whip(Beverage bevarage) {
		this.bevarage = bevarage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return bevarage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .10 + bevarage.cost();
	}

}
