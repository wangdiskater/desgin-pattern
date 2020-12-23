package firsttry.factory.example;

/**
 * @Description
 * @ClassName HumanFactory
 * @Author wangDi
 * @date 2020-10-15 11:15
 */
public class HumanFactory {

    static Human createHuman(String sex) {
        if ("boy".equals(sex)) {
            return new Boy();
        }
        if ("girl".equals(sex)) {
            return new Girl();
        }
        return null;
    }
}
