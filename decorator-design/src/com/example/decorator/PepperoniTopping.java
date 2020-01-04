package com.example.decorator;

public class PepperoniTopping extends PizzaToppingDecorator {

	public PepperoniTopping(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + ", Pepperoni";
	}

	@Override
	public double getPrice() {
		return super.getPrice() + 1.50;
	}

}