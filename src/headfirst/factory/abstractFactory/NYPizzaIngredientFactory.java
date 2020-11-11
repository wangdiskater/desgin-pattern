package headfirst.factory.abstractFactory;

import headfirst.factory.abstractFactory.ingredient.cheese.ReggianoCheese;
import headfirst.factory.abstractFactory.ingredient.clams.Clams;
import headfirst.factory.abstractFactory.ingredient.clams.FreshClams;
import headfirst.factory.abstractFactory.ingredient.peppers.SlicePepperoni;
import headfirst.factory.abstractFactory.ingredient.sauce.MarinaraSauce;
import headfirst.factory.abstractFactory.ingredient.sauce.Sauce;
import headfirst.factory.abstractFactory.ingredient.veggies.Garlic;
import headfirst.factory.abstractFactory.ingredient.veggies.Mushroom;
import headfirst.factory.abstractFactory.ingredient.veggies.Onion;
import headfirst.factory.abstractFactory.ingredient.veggies.Veggies;
import headfirst.factory.abstractFactory.ingredient.cheese.Cheese;
import headfirst.factory.abstractFactory.ingredient.dough.Dough;
import headfirst.factory.abstractFactory.ingredient.dough.ThinCrustDough;
import headfirst.factory.abstractFactory.ingredient.peppers.Pepperoni;

/**
 * @Description
 * @ClassName NYPizzaIngredientFactory
 * @Author wangDi
 * @date 2020-11-05 17:16
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {

        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggiess() {

        return new Veggies[]{new Garlic(), new Onion(), new Mushroom()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicePepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
