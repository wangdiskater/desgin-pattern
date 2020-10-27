package chain.trial;

/**
 * @Description
 * @ClassName CarChainFactory
 * @Author wangDi
 * @date 2020-10-10 17:16
 */
public class CarChainFactory {

    static CarChain getCarChainHead() {
        CarChainA carChainA = new CarChainA();
        CarChainB carChainB = new CarChainB();
        CarChainC carChainC = new CarChainC();
        carChainA.setNextChain(carChainB);
        carChainB.setNextChain(carChainC);

        return carChainA;
    }
}
