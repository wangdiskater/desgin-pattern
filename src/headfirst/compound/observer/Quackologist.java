package headfirst.compound.observer;

/**
 * @Description
 * @ClassName Quackologist
 * @Author wangDi
 * @date 2020-12-10 16:32
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable subject) {
        System.out.println("有东西在叫");
        System.out.println(subject);

    }
}
