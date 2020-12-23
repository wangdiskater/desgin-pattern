package headfirst.proxy.leacy.mystate;

/**
 * @Description  状态轮转的操作：投币， 退币 ， 转动， 出货
 * @ClassName State
 * @Author wangDi
 * @date 2020-12-07 16:10
 */
public interface State {

    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
