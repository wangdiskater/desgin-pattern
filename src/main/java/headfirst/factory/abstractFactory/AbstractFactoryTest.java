package headfirst.factory.abstractFactory;

import headfirst.factory.abstractFactory.pizza.Pizza;
import headfirst.factory.abstractFactory.store.NYPizzaStore;

/**
 * @Description
 * @ClassName AbstractFactoryTest
 * @Author wangDi
 * @date 2020-11-11 11:49
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza);

    }
}
