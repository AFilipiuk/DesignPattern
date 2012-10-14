package decorator;

public class Mocha extends CondimentDecorator {
	Beverage bevarage;
	
	public Mocha(Beverage bevarage) {
		this.bevarage = bevarage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return bevarage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .20 + bevarage.cost();
	}

}
