package main.java.com.kssasarma.behavioural.Factory;

// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeFactoryTest {
    ShapeFactory shapeFactory = new ShapeFactory();
    IShape roundFood = shapeFactory.getShape("Round");
    IShape cylinderFood = shapeFactory.getShape("Cylinder");

    // @Test
    public void testGetShape() {
        // assertEquals("Round", roundFood.getShape());
        // assertEquals("Cylinder", cylinderFood.getShape());
    }
}
