package headfirst.factory.abstractFactoryPattern;

/**
 * @Description
 * @ClassName AbstractFactory
 * @Author wangDi
 * @date 2020-11-11 11:33
 */
public abstract class AbstractFactory {

    /**
     * 工厂方法是抽象工厂的一部分
     * @return
     */
    public abstract ProductA createProductA();

    public abstract ProductB createProductB();
}
