package services;

import domain.Balloon;
import domain.Cake;
import java.io.*;

/**
 * I considered having this in an Order domain class with its own Builder
 * I was concerned about having a fluent interface inside a fluent interface,
 * it seemed like it was getting very verbose
 */
public class OrderService {
    
    /**
     * Ordinarily this would be doing something like saving to a database
     */
    public String orderBalloon(Balloon balloon) {
        return "Ordered Balloon with " + balloon.toString();
    }
    
    public String orderCake(Cake cake) {
        return "Ordered Cake with " + cake.toString();
    }
}