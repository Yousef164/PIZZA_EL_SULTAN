package Services;

import java.util.ArrayList;
import Classes.Order;
import Classes.Item;
import Classes.Discounts;

public class discountService {
    public static String tryAllDiscounts(Order order) {
        ArrayList<Item> items = order.getAllItems();
        int pizzaQuantity = itemService.getPizzaQuantity(items);

        if(pizzaQuantity >= 2 && order.getTotal() > 300){
            int price = order.getTotal() - Discounts.discount15(order.getTotal());
            order.setDiscount(price);
            return "15%";
        } else if (order.getTotal() > 500) {
            int price = order.getTotal() - Discounts.discout10(order.getTotal());
            order.setDiscount(price);
            return "10%";
        } else {
            return "non";
        }
    }
}
