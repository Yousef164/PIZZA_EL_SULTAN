package Classes;

public class Delivery {
    private final int deliveryId;
    private final Order order;
    private final String address;
    private final String phoneNumber;
    private final int deliveryFee = 30;

    public Delivery(int deliveryId, Order order, String address, String phoneNumber) {
        this.deliveryId = deliveryId;
        this.order = order;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getDeliveryFee() {
        return this.deliveryFee;
    }
    public String getAddress() {
        return this.address;
    }
    public String getPhoneNumber() { return this.phoneNumber; }

    public String sms() {
        return "Delivery takes about 15 minutes.";
    }
}