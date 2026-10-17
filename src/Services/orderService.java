package Services;

import java.util.ArrayList;
import java.util.Random;
import Classes.*;
import Conditions.choosePaymentMethod;
import HelpersClasses.PaymentMethod;

public class orderService {
    public static Order createOrder(Customer customer, ArrayList<Item> pizzas, String deliveryDetails, boolean delivery){
        Random random = new Random();

        PaymentMethod paymentMethod = choosePaymentMethod.chooseMethod();
        
        Order order = new Order(
                random.nextInt(1000),
                customer,
                pizzas,
                itemService.totalPrice(pizzas),
                itemService.getItemsQuantity(pizzas),
                paymentMethod,
                delivery
        );
        return order;
    }
}
