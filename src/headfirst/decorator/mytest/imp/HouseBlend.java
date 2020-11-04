package headfirst.decorator.mytest.imp;

import headfirst.decorator.mytest.Beverage;

/**
 * @Description
 * @ClassName HouseBlend
 * @Author wangDi
 * @date 2020-10-30 10:48
 */
public class HouseBlend extends Beverage {
    @Override
    public float cost() {
        System.out.println("混合咖啡");
        return 10f;
    }
}
