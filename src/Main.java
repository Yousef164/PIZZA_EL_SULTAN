import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

import Classes.*;
import Services.*;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        ArrayList <Customer> customers = new ArrayList<>();
        int customerId = 1;

        while(true) {
            System.out.println("Enter (Start / End): ");
            String Start = UI.readString();
            if(Start.equalsIgnoreCase("End"))
                break;

            Customer customer = customerService.createCustomer(customerId);

            ArrayList<Item> pizzaOrder = itemService.itemsDetails();

            String wantDelivery = deliveryService.deliveryDetails();
            boolean isDelivery = deliveryService.doYouWantDelivery(wantDelivery);

            Order order = orderService.createOrder(customer, pizzaOrder, wantDelivery, isDelivery);

            Delivery delivery = deliveryService.createDelivery(order, wantDelivery);

            Receipt receipt = receiptService.createReceipt(order, delivery);

            receiptService.printReceipt(receipt);

           customerId += 1;
        }
    }
}