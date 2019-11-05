package scrap.heap.refactor;

import domain.Balloon;
import domain.Cake;
//import domain.Order;
//import services.OrderParser;
import services.OrderService;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        //This would usually be done with some sort of dependency injection framework
        OrderService orderService = new OrderService();
        
        if (args.length > 0) {
            /**
             * TODO in a real situation: 
             * Define an interface. For now just taking previously defined input
             * I'm also assuming in this block that the args are json of the 
             * properties of cakes and balloons
             */
            /*OrderParser orderParser = new OrderParser('json');
            Array[Order] orders = orderParser.parse(args);
            for (Order order: orders) {
                orderService.orderBalloon(order.getBalloon());
                orderService.orderCake(order.getCake());
            }
            */
        }
        else defaultOrders(orderService);
    }

    private static void defaultOrders(OrderService orderService) {
        System.out.println(orderService.orderBalloon(
            new Balloon.Builder("Red").withMaterial("Mylar").withNumber(4).build()
        ));
        System.out.println(orderService.orderCake(
            new Cake.Builder("Chocolate").withFrostingFlavor("Chocolate")
                    .withShape("Circle").withSize("Large").withCakeColor("Brown")
                    .build()
        ));
        /*
        orderService.orderBalloon(new Balloon("Blue", "Latex", 7));
        orderService.orderCake(new Cake("Vanilla", "Chocolate", "Square", "Medium", "Brown"));
        
        orderService.orderBalloon(new Balloon("yellow", "mylar", 4));
        orderService.orderCake(new Cake("Vanilla", "Vanilla", "Square", "small", "yellow"));*/
    }

}
