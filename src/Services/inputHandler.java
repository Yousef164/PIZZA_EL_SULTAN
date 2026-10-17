package Services;

import Conditions.numberOfThePizza;
import Classes.UI;

public class inputHandler {
    public static int getValidChoice(int maxOptions) {
        int choice = UI.readInt();

        while (numberOfThePizza.isNumber(choice, maxOptions)) {
            System.out.println("Your number is wrong, please try again:");
            choice = UI.readInt();
        }
        return choice;
    }
}
