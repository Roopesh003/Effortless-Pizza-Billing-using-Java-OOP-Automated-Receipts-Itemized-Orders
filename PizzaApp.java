package com.kodnest.pizza;

public class PizzaApp {
	public static void main(String[] args) {
//		Pizza pi =  new Pizza(false);
//		pi.addExtraCheese();
//		pi.addExtraToppings();
//		pi.takeAway();
//		pi.getBill();
		
		DeluxPizza dp = new DeluxPizza(false);
		dp.addExtraCheese();
		dp.addExtraToppings();
		dp.takeAway();
		dp.getBill();
	}
}
