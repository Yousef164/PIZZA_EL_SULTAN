package Conditions;

import java.util.Random;
import HelpersClasses.PaymentMethod;
import Classes.UI;

public class choosePaymentMethod {

    private static final Random random = new Random();

    public static PaymentMethod chooseMethod() {

        PaymentMethod[] methods = PaymentMethod.values();

        while(true) {
        System.out.println("Choose Payment Method:");

            for(int i = 0; i < methods.length; i++){
                System.out.println((i + 1) + ". " + methods[i].getName());
            }

            int choose = UI.readInt();

            if(choose >= 1 && choose <= methods.length){
                choose -= 1;
                if(methods[choose] != PaymentMethod.CASH && !random.nextBoolean()){
                    System.out.println("Failed.");
                    continue;
                }
                System.out.println("Success.");
                return methods[choose];
            } else {
                System.out.println("Invalid choice! Please enter 1 for Cash or 2 for Card.");
            }

        }
    }
}
