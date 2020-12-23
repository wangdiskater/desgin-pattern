package firsttry.template.example;

/**
 * @Description
 * @ClassName Truck
 * @Author wangDi
 * @date 2020-10-15 11:54
 */
public class Truck extends Vehicle {
    @Override
    void start() {
        setStatus(Boolean.FALSE);
        System.out.println("启动失败");
    }

    @Override
    void run() {
        System.out.println("都启动不起来怎么跑！");
    }

    @Override
    void stop() {
        System.out.println("拉跨");
    }
}
