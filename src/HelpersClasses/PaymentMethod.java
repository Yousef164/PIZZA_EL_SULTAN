package HelpersClasses;

public enum PaymentMethod {
    CARD("CARD"),
    CASH("CASH"),
    ONLINE_WALLET("ONLINE-WALLET");

    private final String name;

    PaymentMethod(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
