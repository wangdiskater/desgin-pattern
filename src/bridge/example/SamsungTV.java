package bridge.example;

/**
 * @Description
 * @ClassName SamsungTV
 * @Author wangDi
 * @date 2020-10-20 10:51
 */
public class SamsungTV implements ITV {
    @Override
    public void on() {
        System.out.println("samsung is turned on");
    }

    @Override
    public void off() {
        System.out.println("samsung is turned off");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("samsung: channel -> " + channel);
    }
}
