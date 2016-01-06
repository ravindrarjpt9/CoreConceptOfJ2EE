package com.designPatterns.factory;

public class TestFactoryPattern {

	
	//1) Abstract Factory design pattern  creates Factory
	//2) Factory design pattern creates Products

	
	/*
	 * 
	 * (DOM Parser) DocumentBuilderFactory  class which is an example abstract factory design pattern because it returns a factory called DocumentBuilder which then used to create Document.
	 */
	public static void main(String[] args) {
		
		System.out.println(CarFactory.buildCar(CarType.LUXURY));
		System.out.println(CarFactory.buildCar(CarType.SEDAN));
		System.out.println(CarFactory.buildCar(CarType.SMALL));
	}
}
