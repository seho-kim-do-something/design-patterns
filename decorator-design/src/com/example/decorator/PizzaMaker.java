package com.example.decorator;

public class PizzaMaker {

	public static void main(String[] args) {
		Pizza pizza = new CheeseTopping(new PepperoniTopping(new PlainPizza()));
		System.out.println("Description: " + pizza.getDescription());
		System.out.println("Price: $" + pizza.getPrice());
	}

}
