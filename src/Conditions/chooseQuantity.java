package Conditions;

import Classes.UI;

public class chooseQuantity {
    public static int requiredQuantity() {
        System.out.println("Enter item quantity : ");
        while(true){
            int quantity = UI.readInt();
            if(quantity >= 1){
                return quantity;
            }
            System.out.println("Invalid quantity!");
            System.out.println("Please enter a quantity greater than or equal to one.");
        }

    }
}
