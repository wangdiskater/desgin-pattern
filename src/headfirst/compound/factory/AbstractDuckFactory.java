package headfirst.compound.factory;

import headfirst.compound.Quackable;

/**
 * @Description 找个地方 封装鸭子和装饰者  抽象工厂
 * @ClassName AbstractDuckFactory
 * @Author wangDi
 * @date 2020-12-10 14:55
 */
public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();


}
