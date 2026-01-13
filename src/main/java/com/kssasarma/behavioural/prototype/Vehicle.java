package com.kssasarma.behavioural.prototype;

public abstract class Vehicle {
	public int wheels;
	protected long price;

	public Vehicle() {

	}

	public Vehicle(Vehicle target) {
		if (target != null) {
			this.wheels = target.wheels;
			this.price = target.price;
		}
	}

	public abstract Vehicle clone();

	public abstract boolean isClone(Vehicle target);
}
