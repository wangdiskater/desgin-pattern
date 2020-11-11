package headfirst.factory.abstractFactory.store;

import headfirst.factory.abstractFactory.NYPizzaIngredientFactory;
import headfirst.factory.abstractFactory.PizzaIngredientFactory;
import headfirst.factory.abstractFactory.pizza.CheesePizza;
import headfirst.factory.abstractFactory.pizza.Pizza;

/**
 * @Description
 * @ClassName NYPizzaStore
 * @Author wangDi
 * @date 2020-11-11 11:05
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("cheese pizza in NY");
                break;

                //....
            default:

        }

        return pizza;
    }
}
