package aldovalzani.be_hw_m2_w1_d2.entities;

import java.util.List;


public class Menu {
    private List<Pizza> pizzaList;
    private List<Drink> drinkList;

    public Menu(List<Drink> drinkList, List<Pizza> pizzaList) {
        this.drinkList = drinkList;
        this.pizzaList = pizzaList;
    }

    public void stampaMenu() {
        System.out.println("Pizzas: ");
        for (Pizza pizza : pizzaList) {
            System.out.println("- " + pizza.getName() + " |Calorie: " + pizza.getCalories() + " |Prezzo: " + pizza.getPrice() + " €");
            for (Topping topping : pizza.getCondimenti()) {
                System.out.println(" * " + topping.getName());
            }
        }
        System.out.println("Drinks: ");
        for (Drink drink : drinkList) {
            System.out.println("- " + drink.getName() + " |Calorie: " + drink.getCalories() + " |Prezzo: " + drink.getPrice() + " €");
        }
    }
}
