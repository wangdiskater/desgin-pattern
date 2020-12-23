package headfirst.factory.abstractFactoryPattern.imp;

import headfirst.factory.abstractFactoryPattern.AbstractFactory;
import headfirst.factory.abstractFactoryPattern.ProductA;
import headfirst.factory.abstractFactoryPattern.ProductB;

/**
 * @Description
 * @ClassName ConcreteFactory1
 * @Author wangDi
 * @date 2020-11-11 11:34
 */
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
}
