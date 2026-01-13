package com.kssasarma.behavioural.builder;

public class AppartmentBuilder {

	private int sqm = -1;
	private int rooms = -1;
	private String city = "";
	private String area = "";
	private boolean hasKitchen = false;

	public AppartmentBuilder setSqm(int sqm) {
		this.sqm = sqm;
		return this;
	}

	public AppartmentBuilder setRooms(int rooms) {
		this.rooms = rooms;
		return this;
	}

	public AppartmentBuilder setCity(String city) {
		this.city = city;
		return this;
	}

	public AppartmentBuilder setArea(String area) {
		this.area = area;
		return this;
	}

	public AppartmentBuilder setHasKitchen(boolean hasKitchen) {
		this.hasKitchen = hasKitchen;
		return this;
	}

	public Apartment build() {
		return new Apartment(sqm, rooms, city, area, hasKitchen);
	}
}
