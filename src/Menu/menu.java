package Menu;

public enum menu {
    MARGHERITA("Margherita pizza", 100),
    CHICKEN_RANCH("Chicken Ranch pizza",160),
    COLA("Cola", 30),
    WATER("Water", 15);

    private final String name;
    private final int price;

    menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
    public int getPrice() {
        return this.price;
    }
}