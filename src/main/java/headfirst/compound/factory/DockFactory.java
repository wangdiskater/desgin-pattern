package headfirst.compound.factory;

import headfirst.compound.*;

/**
 * @Description
 * @ClassName DockFactory
 * @Author wangDi
 * @date 2020-12-10 14:57
 */
public class DockFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
