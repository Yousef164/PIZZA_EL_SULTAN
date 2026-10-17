package Classes;

public class Receipt {
    private Order order;
    private Delivery delivery;

    public Receipt(Order order) {
        this.order = order;
        this.delivery = null;
    }

    public Receipt(Order order, Delivery delivery) {
        this.order = order;
        this.delivery = delivery;
    }

    public Order getOrder() {
        return this.order;
    }

    public Delivery getDelivery() {
        return this.delivery;
    }
}