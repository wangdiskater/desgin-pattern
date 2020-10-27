package firsttry.factory.example;

/**
 * @Description
 * @ClassName Girl
 * @Author wangDi
 * @date 2020-10-15 11:14
 */
public class Girl extends Human {
    @Override
    public void talk() {
        System.out.println("talking police");
    }

    @Override
    public void walk() {
        System.out.println("walking elegant");
    }
}
