package headfirst.factory.abstractFactory;

import headfirst.factory.abstractFactory.ingredient.cheese.Cheese;
import headfirst.factory.abstractFactory.ingredient.clams.Clams;
import headfirst.factory.abstractFactory.ingredient.dough.Dough;
import headfirst.factory.abstractFactory.ingredient.peppers.Pepperoni;
import headfirst.factory.abstractFactory.ingredient.sauce.Sauce;
import headfirst.factory.abstractFactory.ingredient.veggies.Veggies;

/**
 * @Description
 * @ClassName PizzaIngredientFactory
 * @Author wangDi
 * @date 2020-11-05 16:52
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggiess();

    Pepperoni createPepperoni();

    Clams createClam();


}
