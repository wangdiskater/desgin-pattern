package decorator.trial.imp;

import decorator.trial.Decorator;
import decorator.trial.Goods;

/**
 * @Description
 * @ClassName WrapDecorator
 * @Author wangDi
 * @date 2020-10-19 11:29
 */
public class WrapDecorator extends Decorator {


    public WrapDecorator(Goods goods) {
        this.goods = goods;

    }

    @Override
    public void function(Goods goods) {
        goods.setWraped(Boolean.TRUE);
        System.out.println("打包物品！");
    }

    /**
     * 重写Decorator继承的Goods
     *
     */
    @Override
    public void introduce() {
        System.out.println("我可以操作上");
        // 这样确实有问题，不能这样用，会为null
        super.introduce();
        System.out.println("我可以操作下");
    }

    /**
     * 直接拿Decorator的属性Goods
     */
    public void introduce2(){
        System.out.println("我可以操作上");
        goods.introduce();
        System.out.println("我可以操作下");

    }
}
