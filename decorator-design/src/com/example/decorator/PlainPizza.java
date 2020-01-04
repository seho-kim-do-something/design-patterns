package com.example.decorator;

public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {
		return "Plain dough";
	}

	@Override
	public double getPrice() {
		return 4.00;
	}
	
}
