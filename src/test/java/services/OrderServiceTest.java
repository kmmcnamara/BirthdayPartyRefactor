package services;

import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;
import domain.*;

public class OrderServiceTest {
    
    @Test public void testOrderCake() {
        OrderService orderService = new OrderService();
        Cake cake = new Cake
            .Builder("Chocolate")
            .withFrostingFlavor("Cream Cheese")
            .withShape("Round")
            .withSize("Small")
            .withCakeColor("Pink")
            .build();
            
        assertEquals(
            "Ordered Cake with " + cake.toString(),
            orderService.orderCake(cake)
        );
    }
    
    @Test public void testOrderBalloon() {
        OrderService orderService = new OrderService();
        Balloon balloon = new Balloon
            .Builder("Blue")
            .withMaterial("Latex")
            .withNumber(6)
            .build();
        
       assertEquals(
            "Ordered Balloon with " + balloon.toString(),
            orderService.orderBalloon(balloon)
        );
    }
}