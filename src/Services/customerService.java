package Services;

import Classes.Customer;
import Classes.UI;

public class customerService {
    public static Customer createCustomer(int id) {
        System.out.println("Enter your name: ");
        String name = UI.readString();
        Customer customer = new Customer(id, name);
        return customer;
    }
}
