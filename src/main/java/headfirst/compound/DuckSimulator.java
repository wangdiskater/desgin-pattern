package headfirst.compound;

/**
 * @Description
 * @ClassName DuckSimulator
 * @Author wangDi
 * @date 2020-12-10 14:39
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();
    }

    private void simulate() {
        MallardDuck mallardDuck = new MallardDuck();
        RedheadDuck redheadDuck = new RedheadDuck();
        DuckCall duckCall = new DuckCall();
        RubberDuck rubberDuck = new RubberDuck();

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
