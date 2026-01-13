package com.kssasarma.creational.Factory;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ShapeFactoryTest {
	ShapeFactory shapeFactory = new ShapeFactory();
	IShape roundFood = shapeFactory.getShape("Round");
	IShape cylinderFood = shapeFactory.getShape("Cylinder");

	@Test
	public void testGetShape() {
		assertEquals("Round", roundFood.getShape());
		assertEquals("Cylinder", cylinderFood.getShape());
	}
}
