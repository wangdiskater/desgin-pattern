package factory.example;

/**
 * @Description
 * @ClassName Boy
 * @Author wangDi
 * @date 2020-10-15 11:13
 */
public class Boy extends Human {
    public Boy() {
    }

    @Override
    public void talk() {
        System.out.println("中国新说唱");
    }

    @Override
    public void walk() {
        System.out.println("太空步");
    }
}
