package domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class BalloonTest {
    @Test public void testBalloon() {
        Balloon balloon = new Balloon("Blue", "Latex", 6);
        assertEquals(balloon.getColor(), "Blue");
        assertEquals(balloon.getMaterial(), "Latex");
        assertEquals(balloon.getNumber(), 6);
    }
}