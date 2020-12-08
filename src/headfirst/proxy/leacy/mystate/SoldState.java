package headfirst.proxy.leacy.mystate;

/**
 * @Description
 * @ClassName NoQuartState
 * @Author wangDi
 * @date 2020-12-07 16:14
 */
public class SoldState implements State{

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {
        int count = gumballMachine.getCount();
        if (count > 0) {
            gumballMachine.setCount(count -= 1);
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
