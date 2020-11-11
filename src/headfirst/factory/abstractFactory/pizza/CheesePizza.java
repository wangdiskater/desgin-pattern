package headfirst.factory.abstractFactory.pizza;

import headfirst.factory.abstractFactory.PizzaIngredientFactory;

/**
 * @Description
 * @ClassName CheesePizza
 * @Author wangDi
 * @date 2020-11-11 10:55
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("preparing" + getName());
        setDough(ingredientFactory.createDough());
        setSauce(ingredientFactory.createSauce());
        setCheese(ingredientFactory.createCheese());

    }
}
