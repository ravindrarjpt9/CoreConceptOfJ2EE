package com.designPatterns.factory;

public class CarFactory {

	public static Car buildCar(CarType modal)
	{
		Car car = null;
		switch(modal)
		{
		case SMALL:
			car = new SmallCar();
			break;
		case SEDAN:
			car = new SedanCar();
			break;
		case LUXURY:
			car = new LuxuryCar();
			break;
		default :
			// Throw some exp
			break;
		}
		return car;
	}
}
