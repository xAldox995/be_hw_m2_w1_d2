package aldovalzani.be_hw_m2_w1_d2.entities;

public abstract class Alimento {
    protected String name;
    protected double price;
    protected int calories;

    public Alimento(int calories, String name, double price) {
        this.calories = calories;
        this.name = name;
        this.price = price;
    }

    public Alimento() {
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
