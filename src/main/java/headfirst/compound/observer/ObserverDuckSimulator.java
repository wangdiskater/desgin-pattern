package headfirst.compound.observer;

import headfirst.compound.Goose;
import headfirst.compound.Quackable;
import headfirst.compound.adapter.GooseAdapter;
import headfirst.compound.composite.Flock;
import headfirst.compound.factory.AbstractDuckFactory;
import headfirst.compound.factory.CountingDuckFactory;

/**
 * @Description
 * @ClassName ObserverDuckSimulator
 * @Author wangDi
 * @date 2020-12-10 16:39
 */
public class ObserverDuckSimulator {
    public static void main(String[] args) {
        ObserverDuckSimulator simulator = new ObserverDuckSimulator();

        CountingDuckFactory countingDuckFactory = new CountingDuckFactory();

        simulator.simulate(countingDuckFactory);
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


        // create observer
        Quackologist quackologist = new Quackologist();
        topFlock.registerObserver(quackologist);

        simulate(topFlock);

    }

    private void simulate(Flock topFlock) {
        topFlock.quack();
    }


}
