package com.designPatterns.factory;

public class SedanCar extends Car{

	
	public SedanCar() {

		super(CarType.SEDAN);
		construct();
	}
	
	@Override
	protected void construct() {
System.out.println("Building sedan car ****");
//add accessories	
	}
}


