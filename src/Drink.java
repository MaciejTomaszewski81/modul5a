public class Drink {
    private String name;
    private double price;
    private boolean alcohol;

    public double getPrice() {
        return price;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public Drink(String name, double price, boolean alcohol) {
        this.name = name;
        this.price = price;
        this.alcohol = alcohol;
    }
}
