package firsttry.decorator.trial;

import firsttry.decorator.trial.imp.Package;
import firsttry.decorator.trial.imp.WrapDecorator;

/**
 * @Description 包装者模式，其实就是给快递公司打包包裹,需要盒子，需要贴地址，需要胶带。。。。 而且并没有顺序，
 * @ClassName MyDecorator
 * @Author wangDi
 * @date 2020-10-19 11:11
 */
public class MyDecoratorTest {

    public static void main(String[] args) {
        Goods aPackage = new Package();
        aPackage.setName("笔记本");
        aPackage.setFeature("记录");
        WrapDecorator wrapDecorator = new WrapDecorator(aPackage);


        wrapDecorator.introduce();
        wrapDecorator.introduce2();

    }

}
