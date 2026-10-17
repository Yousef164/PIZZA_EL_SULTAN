package Services;

import java.util.EnumSet;

import Classes.UI;
import Menu.extra;
import Menu.menuPrinter;

public class extraService {
    public static EnumSet<extra> selectExtras() {
        EnumSet <extra> selectedExtras = EnumSet.noneOf(extra.class);
        extra[] allExtras = extra.values();
        int doneOption = allExtras.length + 1;

        while(true) {
            menuPrinter.printExtraMenu();
            System.out.println("Select an extra option (or " + doneOption + " to finish):");
            int choice = UI.readInt();

            if(choice == doneOption){
                break;
            }

            if(choice >= 1 && choice <= allExtras.length){
                extra extraChoice = allExtras[choice - 1];

                if(selectedExtras.contains(extraChoice)){
                    System.out.println(extraChoice.getName() + " is already added!");
                } else {
                    selectedExtras.add(extraChoice);
                    System.out.println("Added: " + extraChoice.getName());
                }

            } else{
                System.out.println("Invalid choice, try again!");
            }
        }
        return selectedExtras;
    }
}
