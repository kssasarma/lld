package com.kssasarma.creational.builder;

public class Apartment {

	private int sqm;
	private int rooms;
	private String city;
	private String area;
	private boolean hasKitchen;

	public Apartment(int sqm, int rooms, String city, String area, boolean hasKitchen) {
		this.sqm = sqm;
		this.rooms = rooms;
		this.city = city;
		this.area = area;
		this.hasKitchen = hasKitchen;
	}

	public int getSqm() {
		return sqm;
	}

	public int getRooms() {
		return rooms;
	}

	public String getCity() {
		return city;
	}

	public String getArea() {
		return area;
	}

	public void setHasKitchen(boolean hasKitchen) {
		this.hasKitchen = hasKitchen;
	}

	public void display() {
		System.out.println("Apartment [sqm=" + sqm + ", rooms=" + rooms + ", city=" + city + ", area=" + area
				+ ", hasKitchen=" + hasKitchen + "]");
	}

}
