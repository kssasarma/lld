package com.kssasarma.behavioural.builder;

public class Main {

	public static void main(String[] args) {
		Apartment apartment = new AppartmentBuilder().//
				setSqm(120).//
				setRooms(3).//
				setCity("New York").//
				setArea("Manhattan").//
				setHasKitchen(true).build();

		apartment.display();

		Apartment apartment2 = new AppartmentBuilder().//
				setSqm(80).setCity("Los Angeles").//
				setArea("Beverly Hills").build();
		apartment2.display();
	}
}
