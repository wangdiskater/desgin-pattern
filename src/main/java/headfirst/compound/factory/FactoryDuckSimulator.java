package headfirst.compound.factory;

import headfirst.compound.DuckSimulator;
import headfirst.compound.Quackable;
import headfirst.compound.decorator.QuackCounter;

/**
 * @Description
 * @ClassName FactoryDuckSimulator
 * @Author wangDi
 * @date 2020-12-10 15:06
 */
public class FactoryDuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        FactoryDuckSimulator factoryDuckSimulator = new FactoryDuckSimulator();

        factoryDuckSimulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable duckCall = duckFactory.createDuckCall();


        System.out.println("simulator by factory");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(rubberDuck);
        simulate(duckCall);

        System.out.println(QuackCounter.count);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
