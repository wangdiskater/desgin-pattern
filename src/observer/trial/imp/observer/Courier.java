package observer.trial.imp.observer;

import observer.trial.MyObserver;

/**
 * @Description
 * @ClassName Couriers
 * @Author wangDi
 * @date 2020-10-23 16:14
 */
public class Courier implements MyObserver {

    private String name;

    public Courier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void getPacket() {
        System.out.println(name +": 有外卖来了，赶快接单哦");
    }
}
