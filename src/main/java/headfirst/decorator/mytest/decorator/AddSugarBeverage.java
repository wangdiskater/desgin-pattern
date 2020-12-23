package headfirst.decorator.mytest.decorator;

import headfirst.decorator.mytest.Beverage;
import headfirst.decorator.mytest.CondimentDecorator;

/**
 * @Description
 * @ClassName AddSugarBeverage
 * @Author wangDi
 * @date 2020-10-30 10:52
 */
public class AddSugarBeverage extends CondimentDecorator {
    Beverage beverage;

    public AddSugarBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        float v = beverage.cost() + 5f;
        System.out.println("加糖价格:" + v);
        String size = beverage.getSize();
        switch (size) {
            case "tall":
                System.out.println("小杯原价");
                break;
            case "grande":
                System.out.println("中杯+1块");
                v = v + 1;
                break;
            case "venti":
                System.out.println("大杯+5块");
                v = v + 5;
                break;
            default:
        }

        return v;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", sugar";
    }
}
