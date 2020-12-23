package headfirst.compound.composite;

import headfirst.compound.DuckSimulator;
import headfirst.compound.Goose;
import headfirst.compound.Quackable;
import headfirst.compound.adapter.GooseAdapter;
import headfirst.compound.decorator.QuackCounter;
import headfirst.compound.factory.AbstractDuckFactory;
import headfirst.compound.factory.CountingDuckFactory;

/**
 * @Description
 * @ClassName FactoryDuckSimulator
 * @Author wangDi
 * @date 2020-12-10 15:06
 */
public class CompositeFactoryDuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        CompositeFactoryDuckSimulator factoryDuckSimulator = new CompositeFactoryDuckSimulator();

        factoryDuckSimulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        // 卧底
        Goose goose = new Goose();
        Quackable gooseAdapter = new GooseAdapter(goose);
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(duckCall);

        Flock flockOfGoose = new Flock();
        flockOfGoose.add(gooseAdapter);
        Flock topFlock = new Flock();
        topFlock.add(flockOfDucks);
        topFlock.add(flockOfGoose);



        simulate(topFlock);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
