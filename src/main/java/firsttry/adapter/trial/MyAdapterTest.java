package firsttry.adapter.trial;

/**
 * @Description 一个常见的场景： 我们需要改写。相当于包了一层.
 * 比如说我们只有单车，如何像宝马一样拉风。包一层壳
 *
 *
 * @ClassName MyAdapterTest
 * @Author wangDi
 * @date 2020-10-20 19:41
 */
public class MyAdapterTest {

    public static void main(String[] args) {
        Car bmwCar = new BMWCar();

        Car adapterCar = new AdapterCar(new Bicycle());

        bmwCar.run();

        adapterCar.run();

    }

}
