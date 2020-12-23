package firsttry.mediator.trial;

import firsttry.mediator.trial.imp.Buyer;
import firsttry.mediator.trial.imp.MediumMediator;
import firsttry.mediator.trial.imp.Seller;

/**
 * @Description 场景：一个人买东西，一个人卖东西，只有中介才能帮他们带话
 *
 * 拓展：相当于一个配置中心，所有的活动都在mediator里面执行，所以这个例子比较局限了
 *
 *
 *
 * @ClassName MyMediatorTest
 * @Author wangDi
 * @date 2020-10-13 11:17
 */
public class MyMediatorTest {

    public static void main(String[] args) {
        MediumMediator mediumMediator = new MediumMediator();

        Buyer buyer = new Buyer(mediumMediator);
        Seller seller = new Seller(mediumMediator);

        buyer.doSomeThing();
        seller.doSomeThing();
    }
}
