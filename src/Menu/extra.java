package Menu;

public enum extra {
    Cheese("Extra-Cheese", 25),
    Olives("Extra-Olives", 15),
    GarlicBread ("GarlicBread", 50);

    private final String name;
    private final int price;

    extra(String name, int price){
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
