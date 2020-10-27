package firsttry.chain.trial;

/**
 * @Description 责任链模式练习：比如我想要去生产一辆汽车
 *
 * @ClassName ChainTest1
 * @Author wangDi
 * @date 2020-10-10 17:00
 */
public class ChainTest1 {

    public static void main(String[] args) {

        Car car = new Car();

        CarChain carChainHead = CarChainFactory.getCarChainHead();
        carChainHead.create(car);
        System.out.println(car);
    }

}
