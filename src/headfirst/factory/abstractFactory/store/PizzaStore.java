package headfirst.factory.abstractFactory.store;


import headfirst.factory.abstractFactory.pizza.Pizza;

/**
 * @Description
 * @ClassName PizzaStor
 * @Author wangDi
 * @date 2020-11-11 11:01
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
