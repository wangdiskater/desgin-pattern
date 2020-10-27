package adapter.trial;

/**
 * @Description
 * @ClassName AdapterCar
 * @Author wangDi
 * @date 2020-10-20 19:47
 */
public class AdapterCar extends Car {
    private Bicycle bicycle;

    public AdapterCar(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    void run() {
        bicycle.run();
    }
}
