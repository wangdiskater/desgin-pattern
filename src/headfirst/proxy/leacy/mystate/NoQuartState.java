package headfirst.proxy.leacy.mystate;

/**
 * @Description
 * @ClassName NoQuartState
 * @Author wangDi
 * @date 2020-12-07 16:14
 */
public class NoQuartState implements State{
    private GumballMachine gumballMachine;

    public NoQuartState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
