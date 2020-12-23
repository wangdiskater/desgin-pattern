package headfirst.proxy.leacy.mystate;

/**
 * @Description
 * @ClassName GumballMechine
 * @Author wangDi
 * @date 2020-12-07 16:25
 */
public class GumballMachine implements State{
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;

    private State state = soldOutState;
    private int count =  0;

    public GumballMachine(int count) {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuartState(this);
        this.hasQuarterState = new HasQuartState(this);
        this.soldState = new SoldState(this);
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }
    }


    @Override
    public void insertQuarter() {
        state.insertQuarter();
    }

    @Override
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    @Override
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    @Override
    public void dispense() {
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("rolling ball");
        if (count > 0) {
            count--;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
