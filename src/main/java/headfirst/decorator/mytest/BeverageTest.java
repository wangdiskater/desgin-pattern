package headfirst.decorator.mytest;

import headfirst.decorator.mytest.decorator.AddSugarBeverage;
import headfirst.decorator.mytest.imp.DarkRoast;

/**
 * @Description
 * @ClassName BeverageTest
 * @Author wangDi
 * @date 2020-10-30 11:19
 */
public class BeverageTest {
    public static void main(String[] args) {
        DarkRoast darkRoast = new DarkRoast();
        darkRoast.setSize("grande");

        AddSugarBeverage addSugarBeverage = new AddSugarBeverage(darkRoast);
        System.out.println("价格为：" + addSugarBeverage.cost());
    }
}
