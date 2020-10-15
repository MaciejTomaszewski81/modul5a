public class Bar {
    public static void main(String[] args) {
        Person person = new Person("Ellen", "Ripley", 28);
        Drink drink = new Drink("Rum z colą", 15, false);
        Barman barman = new Barman();
        barman.order(drink, person);
    }
}
