public class Bar {
    public static void main(String[] args) {
        Person person = new Person("Ellen", "Ripley", 17);
        Drink drink = new Drink("Rum z colą", 15, true);
        Barman barman = new Barman();
        barman.order(drink, person);
    }
}
