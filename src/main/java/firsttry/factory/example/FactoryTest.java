package firsttry.factory.example;

/**
 * @Description Factory design pattern is used for creating an object based on different parameters. The example below is about creating human in a firsttry.factory.
 * If we ask the firsttry.factory for a boy, the firsttry.factory will produce a boy; if we ask for a girl, the firsttry.factory will produce a girl.
 * Based on different parameters, the firsttry.factory produce different stuff.
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
