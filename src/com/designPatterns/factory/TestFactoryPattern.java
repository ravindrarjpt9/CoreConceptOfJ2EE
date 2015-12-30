package com.designPatterns.factory;

public class TestFactoryPattern {

	public static void main(String[] args) {
		
		System.out.println(CarFactory.buildCar(CarType.LUXURY));
		System.out.println(CarFactory.buildCar(CarType.SEDAN));
		System.out.println(CarFactory.buildCar(CarType.SMALL));
	}
}
