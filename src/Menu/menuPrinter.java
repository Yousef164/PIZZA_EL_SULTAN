package Menu;

public class menuPrinter {

    public static void printPizzaMenu() {
        System.out.println("Available Pizza Menu:");
        menu[] pizzas = menu.values();
        for (int i = 0; i < pizzas.length; i++) {
            System.out.println((i + 1) + ". " + pizzas[i].getName() + " - " + pizzas[i].getPrice() + " EGP");
        }
    }

    public static void printSizeMenu() {
        System.out.println("Choose the pizza size:");
        pizzaSize[] sizes = pizzaSize.values();
        for (int i = 0; i < sizes.length; i++) {
            System.out.println((i + 1) + ". " + sizes[i].getName() + " - " + sizes[i].getPrice() + " EGP");
        }
    }

    public static void printExtraMenu() {
        System.out.println("Choose the extra:");
        extra[] extras = extra.values();
        for(int i = 0; i < extras.length; i++){
            System.out.println((i + 1) + ". " + extras[i].getName() + " - " + extras[i].getPrice() + " EGP");
        }
    }
}