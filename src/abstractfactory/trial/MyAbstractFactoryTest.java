package abstractfactory.trial;

import abstractfactory.trial.apple.ApplePhoneFactory;

/**
 * @Description 场景：手机有不同的厂商，不同厂商生产不同的手机
 *
 *
 * @ClassName MyAbstractFactoryTest
 * @Author wangDi
 * @date 2020-10-16 11:50
 */
public class MyAbstractFactoryTest {
    public static void main(String[] args) {
        Box box = new Box(new ApplePhoneFactory());
        Phone gift = box.getGift();
        gift.run();


    }
}
