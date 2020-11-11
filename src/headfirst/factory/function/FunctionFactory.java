package headfirst.factory.function;

/**
 * @Description 工厂方法
 * @ClassName Factory
 * @Author wangDi
 * @date 2020-11-04 15:06
 */

public abstract class FunctionFactory {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
