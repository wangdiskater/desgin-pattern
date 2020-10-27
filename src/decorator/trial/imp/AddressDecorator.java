package decorator.trial.imp;

import decorator.trial.Decorator;
import decorator.trial.Goods;

/**
 * @Description
 * @ClassName AddressDecorator
 * @Author wangDi
 * @date 2020-10-19 11:31
 */
public class AddressDecorator extends Decorator {
    @Override
    public void function(Goods goods) {
        goods.setAddressed(Boolean.TRUE);
        System.out.println("粘贴地址信息");
    }
}
