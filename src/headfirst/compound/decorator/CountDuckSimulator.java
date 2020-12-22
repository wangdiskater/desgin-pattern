package headfirst.compound.decorator;

import headfirst.compound.*;

/**
 * @Description
 * @ClassName DuckSimulator
 * @Author wangDi
 * @date 2020-12-10 14:39
 */
public class CountDuckSimulator {
    public static void main(String[] args) {
        CountDuckSimulator duckSimulator = new CountDuckSimulator();
        duckSimulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

        System.out.println(QuackCounter.count);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
