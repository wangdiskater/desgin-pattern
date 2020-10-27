package bridge.example;

/**
 * @Description The example of TV and Remote Control(typo in diagram) can demonstrate the two layers of abstraction.
 * You have an interface for TV and an abstract class for remote control. As you know,
 * it is not a good idea to make a concrete class for either of them,
 * because other vendors may make different implementations.
 * 就是不想每个电视配一个遥控器，要是一个遥控器可以遥控多个电视就好了（遥控器抽象就好了,其实就是多对多的关系： 多个遥控器，可以遥控多个电视）
 *
 *
 * @ClassName MyBridgeTest
 * @Author wangDi
 * @date 2020-10-20 10:49
 */
public class MyBridgeTest {

    public static void main(String[] args) {

        ITV tcltv = new TCLTV();

        MyRemoteControl myRemoteControl = new MyRemoteControl(tcltv);

        myRemoteControl.turnOn();
        myRemoteControl.setChannelKeyboard(9);

        myRemoteControl.setTv(new SamsungTV());
        myRemoteControl.turnOn();
        myRemoteControl.setChannelKeyboard(7777);
    }
}
