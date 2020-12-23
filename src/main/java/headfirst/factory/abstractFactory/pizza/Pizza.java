package headfirst.factory.abstractFactory.pizza;

import headfirst.factory.abstractFactory.ingredient.cheese.Cheese;
import headfirst.factory.abstractFactory.ingredient.clams.Clams;
import headfirst.factory.abstractFactory.ingredient.dough.Dough;
import headfirst.factory.abstractFactory.ingredient.peppers.Pepperoni;
import headfirst.factory.abstractFactory.ingredient.sauce.Sauce;
import headfirst.factory.abstractFactory.ingredient.veggies.Veggies;

import java.util.Arrays;

/**
 * @Description
 * @ClassName Pizza
 * @Author wangDi
 * @date 2020-11-11 10:03
 */
public abstract class Pizza {
    private String name;
    private Dough dough;
    private Sauce sauce;
    private Veggies veggies[];
    private Cheese cheese;
    private Pepperoni pepperoni;
    private Clams clam;

    public abstract void prepare();

    public Pizza() {
    }

    void back(){
        System.out.println("back form");
    }
    void cut() {
        System.out.println("cutting the pizza");
    }
    void box() {
        System.out.println("box");
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Veggies[] getVeggies() {
        return veggies;
    }

    public void setVeggies(Veggies[] veggies) {
        this.veggies = veggies;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Pepperoni getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(Pepperoni pepperoni) {
        this.pepperoni = pepperoni;
    }

    public Clams getClam() {
        return clam;
    }

    public void setClam(Clams clam) {
        this.clam = clam;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clam=" + clam +
                '}';
    }
}
