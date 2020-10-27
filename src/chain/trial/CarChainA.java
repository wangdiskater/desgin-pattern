package chain.trial;

/**
 * @Description
 * @ClassName CarChainA
 * @Author wangDi
 * @date 2020-10-10 17:06
 */
public class CarChainA extends CarChain {

    @Override
    void addCarFunction(Car car) {
        car.setMotor("转速3600");
        car.setOutlook("流线型外观");
    }
}
