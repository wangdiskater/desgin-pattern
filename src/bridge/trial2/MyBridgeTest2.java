package bridge.trial2;

import bridge.trial2.imp.color.Red;
import bridge.trial2.imp.commodity.Hat;

/**
 * @Description
 * @ClassName MyBridgeTest2
 * @Author wangDi
 * @date 2020-10-22 10:02
 */
public class MyBridgeTest2 {

    public static void main(String[] args) {

        Hat hat = new Hat(new Red(),"鸭舌帽");

        hat.getColor().show();
    }
}
