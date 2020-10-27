package firsttry.bridge.trial;

import firsttry.bridge.trial.imp.Hat;
import firsttry.bridge.trial.imp.RedOutFitColor;

/**
 * @Description 桥接，就是把抽象 和 实现都分离。场景：我有帽子，外衣，裤子，鞋子。想要红橙黄绿蓝，如果直接写类：需要4*5个类，如果用桥接：只要4+5+2个类即可
 *
 * 记录：你这个根本就不是桥接模式，桥接模式，需要两方扩展，但是还是有所联系，也就是说抽象应该还有接口的实现作为成员变量。你这写的就是一个简单继承（或者说外观模式）。color应该作为commodity的一个属性然后拓展
 * 详情见trial2文件夹
 *
 * @ClassName MyBridgeTest
 * @Author wangDi
 * @date 2020-10-21 09:47
 */
public class MyBridgeTest {

    public static void main(String[] args) {
        Shop shop = new Shop(new Hat("鸭舌帽"), new RedOutFitColor());

        shop.show();
    }
}
