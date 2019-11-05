package domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class BalloonTest {
    @Test public void testBalloonHappyPath() {
        Balloon balloon = new Balloon
            .Builder("Blue")
            .withMaterial("Latex")
            .withNumber(6)
            .build();
        assertEquals(balloon.getColor(), "Blue");
        assertEquals(balloon.getMaterial(), "Latex");
        assert(balloon.getNumber().equals(6));
        assertEquals(balloon.toString(),
        "Color: Blue, Material: Latex, Number: 6");
    }
    
    @Test(expected = IllegalStateException.class)
    public void testBalloonIllegalState() {
        Balloon balloon = new Balloon.Builder("Red").build();
    }
}