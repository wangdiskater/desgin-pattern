package firsttry.chain.trial;

/**
 * @Description
 * @ClassName CarChainB
 * @Author wangDi
 * @date 2020-10-10 17:07
 */
public class CarChainB extends CarChain {

    @Override
    void addCarFunction(Car car) {
        car.setWindow("最高级的玻璃窗");
        car.setWheel("米其林");
    }
}
