package firsttry.bridge.example;

/**
 * @Description
 * @ClassName MyRemoteControl
 * @Author wangDi
 * @date 2020-10-20 10:54
 */
public class MyRemoteControl extends AbstractRemoteControl {
    public MyRemoteControl(ITV tv) {
        super(tv);
    }
    public void setChannelKeyboard(int channel){
        setChannel(channel);
        System.out.println("Logitech use keyword to set channel.");
    }
}
