package firsttry.abstractfactory.trial;

/**
 * @Description
 * @ClassName Box
 * @Author wangDi
 * @date 2020-10-16 11:57
 */
public class Box {
    private Phone gift;

    public Phone getGift() {
        return gift;
    }

    public Box(PhoneFactory phoneFactory) {
        this.gift = phoneFactory.getPhone();
    }
}
