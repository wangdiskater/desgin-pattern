package abstractfactory.trial.apple;

import abstractfactory.trial.Phone;

/**
 * @Description
 * @ClassName ApplePhone
 * @Author wangDi
 * @date 2020-10-16 11:55
 */
public class ApplePhone extends Phone {
    @Override
    public void run() {
        System.out.println("welcome to use apple phone!");
    }
}
