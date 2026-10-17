package Services;

import java.util.Random;
import Classes.UI;
import Classes.Delivery;
import Classes.Order;

public class deliveryService {
    public static String deliveryDetails() {
        System.out.println("Do you want delivery? (yes/no)");
        String choice = UI.readString();
        if(choice.equalsIgnoreCase("yes")){
            System.out.println("Enter your address: ");
            String address = UI.readString();
            System.out.println("Enter your phone number: ");
            String phoneNumber = UI.readString();
            return address + "," + phoneNumber;
        }
        return "";
    }

    public static boolean doYouWantDelivery(String delivery) {
        if(delivery.equals(""))
            return false;
        return true;
    }

    public static Delivery createDelivery(Order order, String details) {
        if(details.equals("")){
            return null;
        }
        Random random = new Random();

        Delivery delivery = new Delivery(
                random.nextInt(1000),
                order,
                details.split(",")[0],
                details.split(",")[1]
        );

        return delivery;
    }
}
