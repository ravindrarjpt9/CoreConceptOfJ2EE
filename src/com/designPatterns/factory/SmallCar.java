package com.designPatterns.factory;

public class SmallCar extends Car{

	public SmallCar() {

		super(CarType.SMALL);
		construct();
	}
	
	@Override
	protected void construct() {

		System.out.println(" building small car *** ");
		// add accessories
		
	}
	
}
