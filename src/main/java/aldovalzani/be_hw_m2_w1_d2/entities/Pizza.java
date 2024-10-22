package aldovalzani.be_hw_m2_w1_d2.entities;

import java.util.ArrayList;
import java.util.List;


public class Pizza extends Alimento {
    protected List<Topping> condimenti;

    public Pizza(int calories, String name, double price) {
        super(calories, name, price);
        this.condimenti = new ArrayList<>();
    }

    public Pizza() {
    }

    public void addCondimento(Topping topping) {
        condimenti.add(topping);
        setPrice(getPrice() + topping.getPrice());
        setCalories(getCalories() + topping.getCalories());
    }

    public List<Topping> getCondimenti() {
        return condimenti;
    }

    public void setCondimenti(List<Topping> condimenti) {
        this.condimenti = condimenti;
    }
}
