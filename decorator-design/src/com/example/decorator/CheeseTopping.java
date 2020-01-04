package com.example.decorator;

public class CheeseTopping extends PizzaToppingDecorator {

	public CheeseTopping(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + ", Cheese";
	}

	@Override
	public double getPrice() {
		return super.getPrice() + 2.50;
	}

}
