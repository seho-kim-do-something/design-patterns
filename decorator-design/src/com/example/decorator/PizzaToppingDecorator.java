package com.example.decorator;

public class PizzaToppingDecorator implements Pizza {
	private Pizza tempPizza;
	
	public PizzaToppingDecorator(Pizza pizza) {
		tempPizza = pizza;
	}

	@Override
	public String getDescription() {
		return tempPizza.getDescription();
	}

	@Override
	public double getPrice() {
		return tempPizza.getPrice();
	}	

}
