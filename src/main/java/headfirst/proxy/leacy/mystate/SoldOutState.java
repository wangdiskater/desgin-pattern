package headfirst.proxy.leacy.mystate;

/**
 * @Description
 * @ClassName NoQuartState
 * @Author wangDi
 * @date 2020-12-07 16:14
 */
public class SoldOutState implements State{
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
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

    }
}
