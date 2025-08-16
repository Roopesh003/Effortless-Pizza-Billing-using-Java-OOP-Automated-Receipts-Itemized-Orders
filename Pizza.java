package com.kodnest.pizza;

public class Pizza {
	private int price;
	private boolean veg;
	
	private int extraCheesePrice  = 100;
	private int extraToppingAdded = 150;
	private int backPack = 20;
	
	private int basePizzaPrice;
	
	private boolean isExtraCheeseAdded;
	private boolean isExtraToppingsAdded;
	private boolean isOptedforTakeAway;
	
	public Pizza(boolean veg) {
		// TODO Auto-generated constructor stub
		this.veg = veg;
		
		if(this.veg) {
			this.price = 300;
		} else {
			this.price = 400;
		}
		basePizzaPrice = this.price;
	}
	
	public void addExtraCheese() {
		isExtraCheeseAdded = true;
		System.out.println("Extra cheese Added");
		this.price += extraCheesePrice;
	}
	
	public void addExtraToppings() {
		isExtraToppingsAdded = true;
		System.out.println("Extra Topping Added");
		this.price += extraToppingAdded;
	}
	
	public void takeAway() {
		isOptedforTakeAway = true;
		System.out.println("Take Away Opted");
		this.price += backPack;
	}
	
	public void getBill() {
		String bill = "";
		System.out.println("Pizza Price: " + basePizzaPrice);
		
		if(isExtraCheeseAdded) {
			bill += "Extra chesse added: " + extraCheesePrice + "\n";
		}
		
		if(isExtraToppingsAdded) {
			bill += "Extra Topping added: " + extraToppingAdded + "\n";
		}
		
		if(isOptedforTakeAway) {
			bill += "Take away: " + backPack + "\n";
		}
		
		bill += "Bill: " + this.price + "\n";
		System.out.println(bill);
	}
}
