package firsttry.abstractfactory.trial.apple;

import firsttry.abstractfactory.trial.Phone;
import firsttry.abstractfactory.trial.PhoneFactory;

/**
 * @Description
 * @ClassName ApplePhoneFactory
 * @Author wangDi
 * @date 2020-10-16 11:55
 */
public class ApplePhoneFactory extends PhoneFactory {
    @Override
    public Phone getPhone() {
        return new ApplePhone();
    }
}
