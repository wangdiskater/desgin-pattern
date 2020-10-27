package firsttry.template.example;

/**
 * @Description
 * @ClassName Car
 * @Author wangDi
 * @date 2020-10-15 11:53
 */
public class  Car extends Vehicle {

    @Override
    void start() {
        setStatus(Boolean.TRUE);
    }

    @Override
    void run() {
        System.out.println("去吧，旋风冲锋");
    }

    @Override
    void stop() {
        System.out.println("辛苦了");
    }
}
