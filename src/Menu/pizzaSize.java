package Menu;

public enum pizzaSize{
    SMALL("Small", 0),
    MEDIUM("Medium", 30),
    LARGE("Large", 60);

    private final String name;
    private final int price;

    pizzaSize(String name, int price) {
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