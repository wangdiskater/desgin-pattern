package decorator.trial;

import decorator.example.Girl;

/**
 * @Description
 * @ClassName Decorator
 * @Author wangDi
 * @date 2020-10-19 11:28
 */
public abstract class Decorator  extends Goods{

    /**
     * 我比较不解的是：为什么既然继承了，还要设置一个成员变量？
     * 可能目的是为了能够aop？
     */
    protected Goods goods;


    public abstract void function(Goods goods);
}
