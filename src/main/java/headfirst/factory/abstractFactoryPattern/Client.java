package headfirst.factory.abstractFactoryPattern;

import headfirst.factory.abstractFactoryPattern.imp.ConcreteFactory1;
import headfirst.factory.abstractFactoryPattern.imp.ConcreteFactory2;

/**
 * @Description
 * @ClassName Client
 * @Author wangDi
 * @date 2020-11-11 11:36
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory concreteFactory1 = new ConcreteFactory1();
        AbstractFactory concreteFactory2 = new ConcreteFactory2();

        concreteFactory1.createProductA();

    }
}
