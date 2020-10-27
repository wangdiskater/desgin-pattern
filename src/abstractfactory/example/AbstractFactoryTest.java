package abstractfactory.example;

import abstractfactory.example.amd.AMDFactory;
import abstractfactory.example.intel.IntelFactory;

/**
 * @Description Abstract Factory pattern adds another layer of abstraction for Factory pattern.
 * If we compare Abstract Factory with Factory, it is pretty obvious that a new layer of abstraction is added.
 * Abstract Factory is a super-factory which creates other factories. We can call it "Factory of factories".
 *
 *
 * 工厂和抽象工厂的区别：
 * 工厂大熔炉，什么都造，男人女人都造
 *
 * 抽象工厂就是自己有自己的品牌
 * 比如说CPU
 * intel的工厂造intel的CPU
 * AMD 的工厂造AMD 的CPU
 * 抽象工厂：就是连工厂都是抽象的
 *
 *
 * @ClassName AbstractFactoryTest
 * @Author wangDi
 * @date 2020-10-15 11:37
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        CpuFactory specificFactory = createSpecificFactory(0);
        CPU produce = specificFactory.produce();
        produce.process();

    }

    static CpuFactory createSpecificFactory(int syn) {
        switch (syn) {
            case 0:
                return new IntelFactory();
            case 1:
                return new AMDFactory();
            default:
                return null;
        }
    }

}
