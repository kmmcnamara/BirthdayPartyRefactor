package domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class BalloonTest {
    @Test public void testBalloon() {
        Balloon balloon = new Balloon
            .Builder("Blue")
            .withMaterial("Latex")
            .withNumber(6)
            .build();
        assertEquals(balloon.getColor(), "Blue");
        assertEquals(balloon.getMaterial(), "Latex");
        assertEquals(balloon.getNumber(), 6);
        assertEquals(balloon.toString(),
        "Color:Blue, Material: Latex, Number: 6");
    }
}