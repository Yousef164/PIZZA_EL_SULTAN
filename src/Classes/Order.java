package Classes;
import HelpersClasses.PaymentMethod;

import java.time.LocalDateTime;
import java.util.ArrayList;

public  class Order {
    private final int orderId;
    private final Customer customer;
    private final LocalDateTime date;
    private final ArrayList<Item> allItems;
    private final int totalItemsPrice;
    private final int quantity;
    private  int totalPrice;
    private final PaymentMethod paymentMethod;
    private final boolean isDelivery;

    public Order(
            int orderId,
            Customer customer,
            ArrayList<Item> allItems,
            int pizzaPrice,
            int quantity,
            PaymentMethod paymentMethod,
            boolean isDelivery
    ) {

        this.orderId = orderId;
        this.customer = customer;
        this.date = LocalDateTime.now();
        this.allItems = allItems;
        this.totalItemsPrice = pizzaPrice;
        this.quantity = quantity;
        this.paymentMethod = paymentMethod;
        this.isDelivery = isDelivery;

        this.totalPrice = pizzaPrice ;
    }
    public int getOrderId() { return orderId; }
    public Customer getCustomer() { return customer; }
    public LocalDateTime getDate() { return date; }
    public ArrayList<Item> getAllItems() { return allItems; }
    public int getItemsPrice() { return totalItemsPrice; }
    public int getQuantity() { return quantity; }
    public int getTotal() { return totalPrice; }
    public String getPaymentMethod() {return paymentMethod.getName();}

    public boolean getIsDelivery() {
        return this.isDelivery;
    }

    public void setDiscount(int price) {
        this.totalPrice = price;
    }
}