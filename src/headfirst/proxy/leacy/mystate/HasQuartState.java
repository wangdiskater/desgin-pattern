package headfirst.proxy.leacy.mystate;

/**
 * @Description
 * @ClassName NoQuartState
 * @Author wangDi
 * @date 2020-12-07 16:14
 */
public class HasQuartState implements State{
    private GumballMachine gumballMachine;

    public HasQuartState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        gumballMachine.setState(gumballMachine.getSoldState());

    }

    @Override
    public void dispense() {

    }
}
