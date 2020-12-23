package headfirst.decorator.mytest.imp;

import headfirst.decorator.mytest.Beverage;

/**
 * @Description
 * @ClassName DarkRoast
 * @Author wangDi
 * @date 2020-10-30 10:48
 */
public class DarkRoast extends Beverage {

    @Override
    public float cost() {
        Float price = 10f;
        System.out.println("深烘焙 原始价格：" + price);
        return price;
    }
}
