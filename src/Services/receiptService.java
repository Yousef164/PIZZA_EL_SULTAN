package Services;

import Classes.Delivery;
import Classes.Receipt;
import Classes.Order;

public class receiptService {
    public static Receipt createReceipt(Order order, Delivery delivery) {
        Receipt receipt = new Receipt(order, delivery);
        return receipt;
    }

    public static void printReceipt(Receipt receipt) {

        System.out.println("\n==================================");
        System.out.println("          PIZZA EL SULTAN           ");
        System.out.println("==================================");
        System.out.println("Order ID       : " + receipt.getOrder().getOrderId());
        System.out.println("Date           : " + receipt.getOrder().getDate());
        System.out.println("Customer       : " + receipt.getOrder().getCustomer().getName());
        System.out.println("----------------------------------");
        System.out.println("Item           : " + itemService.getPizzaName(receipt.getOrder().getAllItems()));
        System.out.println("Price          : " + receipt.getOrder().getItemsPrice() + " EGP ");
        System.out.println("Quantity       : " + receipt.getOrder().getQuantity());
        System.out.println("Subtotal       : " + receipt.getOrder().getTotal() + " EGP");
        System.out.println("Payment Method : " + receipt.getOrder().getPaymentMethod());
        System.out.println("Discount       : " + discountService.tryAllDiscounts(receipt.getOrder()));

        int finalAmount = receipt.getOrder().getTotal();

        if (receipt.getDelivery() != null && receipt.getOrder().getIsDelivery()) {
            System.out.println("Delivery Fee: " + receipt.getDelivery().getDeliveryFee() + " EGP");
            System.out.println("Address    : " + receipt.getDelivery().getAddress());
            finalAmount += receipt.getDelivery().getDeliveryFee();
        }

        System.out.println("----------------------------------");
        System.out.println("TOTAL PAID : " + finalAmount + " EGP");

        if (receipt.getDelivery() != null) {
            System.out.println("Note       : " + receipt.getDelivery().sms());
        }
        System.out.println("==================================\n");
    }
}
