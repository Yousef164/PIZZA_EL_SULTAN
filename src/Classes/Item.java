package Classes;

import java.util.EnumSet;
import Menu.*;

public class Item {
    private final menu item;
    private final pizzaSize size;
    private final EnumSet<extra> selectedExtra;
    private final int quantity;

    public Item(menu item, pizzaSize size, EnumSet<extra> selectedExtra, int quantity){
        this.item = item;
        this.size = size;
        this.selectedExtra = selectedExtra;
        this.quantity = quantity;
    }

    public String getItemName() {
        return this.item.getName();
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int totalItemsPrice() {
        String[] ifPizza = item.getName().split(" ");
        if(ifPizza[ifPizza.length - 1].equals("pizza")){
            int totalExtra = 0;
            for(extra ex : selectedExtra){
                totalExtra += ex.getPrice();
            }
            return (item.getPrice() + size.getPrice() + totalExtra) * quantity;
        }
        return item.getPrice() * quantity;
    }

}
