package com.kssasarma.behavioural.prototype;

public class Car extends Vehicle {

	private String color;

	public Car(int wheels, long price, String color) {
		this.wheels = wheels;
		this.price = price;
		this.color = color;

	}

	public Car(Car target) {
		super(target);
		if (target != null) {
			this.color = target.color;
		}
	}

	@Override
	public Vehicle clone() {
		return new Car(this);
	}

	@Override
	public boolean isClone(Vehicle target) {
		if (target == null || target.getClass() != this.getClass()) {
			return false;
		}
		Car carTarget = (Car) target;
		return carTarget.wheels == this.wheels && carTarget.price == this.price;
	}

}
