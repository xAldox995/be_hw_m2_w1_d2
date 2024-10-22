package aldovalzani.be_hw_m2_w1_d2;

import aldovalzani.be_hw_m2_w1_d2.entities.Drink;
import aldovalzani.be_hw_m2_w1_d2.entities.Menu;
import aldovalzani.be_hw_m2_w1_d2.entities.Pizza;
import aldovalzani.be_hw_m2_w1_d2.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppManager {
    @Bean
    public Topping prosciutto() {
        return new Topping(80, "prosciutto", 1.5);
    }

    @Bean
    public Topping ananas() {
        return new Topping(50, "Ananas", 1.0);
    }

    @Bean
    public Pizza margherita() {
        Pizza margherita = new Pizza(400, "Margherita", 5.0);
        return margherita;
    }

    @Bean
    public Pizza antiCristoPizza() {
        Pizza pizza = new Pizza(400, "Pizza Hawaiana", 5.0);
        pizza.addCondimento(prosciutto());
        pizza.addCondimento(ananas());
        return pizza;
    }

    @Bean
    public Drink cola() {
        return new Drink(150, "Coca-Cola", 2.50);
    }

    @Bean
    public Drink fanta() {
        return new Drink(150, "Fanta", 2.50);
    }

    @Bean
    public Menu menu(List<Drink> drinkList, List<Pizza> pizzaList) {
//        List<Pizza> pizzaList = Arrays.asList(margherita(), antiCristoPizza());
//        List<Drink> drinkList = Arrays.asList(cola(), fanta());
        return new Menu(drinkList, pizzaList);
    }
}
