package bridge.example;

/**
 * @Description
 * @ClassName SamsungTV
 * @Author wangDi
 * @date 2020-10-20 10:51
 */
public class TCLTV implements ITV {
    @Override
    public void on() {
        System.out.println("tcl is turned on");
    }

    @Override
    public void off() {
        System.out.println("tcl is turned off");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("tcl: channel -> " + channel);
    }
}
