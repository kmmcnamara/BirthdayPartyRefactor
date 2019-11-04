package domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class CakeTest {
    @Test public void testCakeHappyPath() {
        Cake cake = new Cake
            .Builder("Chocolate")
            .withFrostingFlavor("Cream Cheese")
            .withShape("Round")
            .withSize("Small")
            .withCakeColor("Pink")
            .build();
        assertEquals(cake.getCakeFlavor(), "Chocolate");
        assertEquals(cake.getFrostingFlavor(), "Cream Cheese");
        assertEquals(cake.getShape(), "Round");
        assertEquals(cake.getSize(), "Small");
        assertEquals(cake.getCakeColor(), "Pink");
        assertEquals(cake.toString(),
        "Cake Flavor: Chocolate, Frosting Flavor: Cream Cheese, " +
        "Shape: Round, Size: Small, Cake Color: Pink");
    }
    
    @Test(expected = IllegalStateException.class) 
    public void testCakeIllegalState() {
        Cake cake = new Cake.Builder("Funfetti").build();
    }
}