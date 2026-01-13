package com.kssasarma.creational.prototype;

public class Bicycle extends Vehicle {

    private boolean cityBike;

    public Bicycle(int wheels, long price, boolean cityBike) {
        this.wheels = wheels;
        this.price = price;
        this.cityBike = cityBike;

    }

    public Bicycle(Bicycle target) {
        super(target);
        if (target != null) {
            this.cityBike = target.cityBike;
        }
    }

    @Override
    public Vehicle clone() {
        return new Bicycle(this);

    }

    @Override
    public boolean isClone(Vehicle target) {
        if (target instanceof Bicycle) {
            Bicycle bicycleTarget = (Bicycle) target;
            return bicycleTarget.wheels == this.wheels && bicycleTarget.price == this.price
                    && bicycleTarget.cityBike == this.cityBike;
        }
        return false;
    }

}
