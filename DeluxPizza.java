package com.kodnest.pizza;

public class DeluxPizza extends Pizza{
	public DeluxPizza(boolean veg) {
		// TODO Auto-generated constructor stub
		super(veg);
		super.addExtraCheese();
		super.addExtraToppings();
	}

	@Override
	public void addExtraCheese() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addExtraToppings() {
		// TODO Auto-generated method stub
		;
	}
}
