package com.designPatterns.factory;

public abstract class Car {

	private CarType modal;
	
	
	public Car() {
		System.out.println(" **** default coust ******");
	}

	
	public Car(CarType modal) {

		this.setModal(modal);
		arrangeParts();
	}

	private void arrangeParts() {
		// Do one time processing here
		System.out.println("****Do one time processing here****");
	}

	public CarType getModal() {
		return modal;
	}

	public void setModal(CarType modal) {
		this.modal = modal;
	}

	// Do subclass level processing in this method
    protected abstract void construct();
}
