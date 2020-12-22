package headfirst.compound.factory;

import headfirst.compound.*;
import headfirst.compound.decorator.QuackCounter;

/**
 * @Description
 * @ClassName CountingDuckFactory
 * @Author wangDi
 * @date 2020-12-10 14:59
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());    }
}
