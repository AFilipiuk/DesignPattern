package main;

import decorator.Beverage;
import decorator.DarkRoast;
import decorator.Espresso;
import decorator.HouseBlend;
import decorator.Mocha;
import decorator.Soy;
import decorator.Whip;

public class StarBuzzCoffee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage bevarage = new Espresso();
		System.out.println(bevarage.getDescription() + " $" + bevarage.cost());
		
		Beverage bevarage2 = new DarkRoast();
		bevarage2 = new Mocha(bevarage2);
		bevarage2 = new Mocha(bevarage2);
		bevarage2 = new Whip(bevarage2);
		System.out.println(bevarage2.getDescription() + " $" + bevarage2.cost());
		
		Beverage bevarage3 = new HouseBlend();
		bevarage3 = new Soy(bevarage3);
		bevarage3 = new Mocha(bevarage3);
		bevarage3 = new Whip(bevarage3);
		System.out.println(bevarage3.getDescription() + " $" + bevarage3.cost()); 
	}

}
