package factory.example;

/**
 * @Description Factory design pattern is used for creating an object based on different parameters. The example below is about creating human in a factory.
 * If we ask the factory for a boy, the factory will produce a boy; if we ask for a girl, the factory will produce a girl.
 * Based on different parameters, the factory produce different stuff.
 * @ClassName FactoryTest
 * @Author wangDi
 * @date 2020-10-15 11:12
 */
public class FactoryTest {

    public static void main(String[] args) {

        Human boy = HumanFactory.createHuman("boy");
        Human girl = HumanFactory.createHuman("girl");
    }

}
