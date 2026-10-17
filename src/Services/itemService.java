package Services;

import java.util.ArrayList;
import java.util.EnumSet;
import Classes.Item;
import Classes.UI;
import Conditions.chooseQuantity;
import Menu.*;

public class itemService {
    public static ArrayList<Item> itemsDetails() {
        ArrayList<Item> items = new ArrayList<>();
        while (true) {
            menuPrinter.printPizzaMenu();
            System.out.println("Select the number of the desired menu:");
            int menuChoice = inputHandler.getValidChoice(menu.values().length);
            menu selectedItem = menu.values()[menuChoice - 1];

            String[] itemNameList = selectedItem.getName().split(" ");
            pizzaSize selectedSize = null;
            EnumSet<extra> userExtras = EnumSet.noneOf(extra.class);

            if(itemNameList[itemNameList.length - 1].equals("pizza")) {

                menuPrinter.printSizeMenu();
                int sizeChoice = inputHandler.getValidChoice(pizzaSize.values().length);
                selectedSize = pizzaSize.values()[sizeChoice - 1];

                userExtras = extraService.selectExtras();
            }

            int quantity = chooseQuantity.requiredQuantity();

            items.add(new Item(selectedItem, selectedSize, userExtras, quantity));

            System.out.println("Do you want to add another menu? (yes/no):");
            String choice = UI.readString();
            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }
        return items;
    }

    public static ArrayList<String> getPizzaName(ArrayList<Item> menu) {
        ArrayList<String> menuName = new ArrayList<>();
        for(Item me : menu){
            menuName.add(me.getItemName());
        }
        return menuName;
    }

    public static int getItemsQuantity(ArrayList<Item> items) {
        int quantity = 0;
        for(Item it : items) {
            quantity += it.getQuantity();
        }
        return quantity;
    }

    public static int getPizzaQuantity(ArrayList<Item> items){
        int total = 0;
        for(Item it: items) {
            String[] name = it.getItemName().split(" ");
            if(name[name.length - 1].equals("pizza")){
                total += it.getQuantity();
            }
        }
        return total;
    }

    public static int totalPrice(ArrayList<Item> items) {
        int total = 0;
        for(Item it: items ){
            total += it.totalItemsPrice();
        }
        return total;
    }

}
