public class Barman {
    void order(Drink drink, Person person) {
        if (drink.isAlcohol() && person.getAge() >=18) {
                System.out.println(person.getName() + ", Twój drink jest gotowy do odbioru. Kwota do zapłaty: " + drink.getPrice() + " zł");
           }  else if (drink.isAlcohol() && person.getAge() < 18) {
            System.out.println("Nie masz 18 lat, nie pijesz alkoholu");
        } else {
            System.out.println("Smacznego drinka");
        }
    }
}

