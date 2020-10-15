public class Barman {
    void order(Drink drink, Person person) {
        if (drink.isAlcohol() && person.getAge() < 18) {
            System.out.println("Nieletnim alkoholu nie sprzedajemy");
        } else {
            System.out.println(person.getName() + " Twój drink jest gotowy do odbioru Kwota do zapłaty: " + drink.getPrice() + " zł");
        }
    }
}

