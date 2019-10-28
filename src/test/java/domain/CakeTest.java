package domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class CakeTest {
    @Test public void testcake() {
        Cake cake = new Cake(
            "Chocolate", 
            "Cream Cheese",
            "Round", 
            "Small",
            "Pink");
        assertEquals(cake.getCakeFlavor(), "Chocolate");
        assertEquals(cake.getFrostingFlavor(), "Cream Cheese");
        assertEquals(cake.getShape(), "Round");
        assertEquals(cake.getSize(), "Small");
        assertEquals(cake.getCakeColor(), "Pink");
        assertEquals(cake.toString(),
        "Cake Flavor: Chocolate, Frosting Flavor: Cream Cheese, " +
        "Shape: Round, Size: Small, Cake Color: Pink");
    }
}