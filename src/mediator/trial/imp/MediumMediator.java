package mediator.trial.imp;

import mediator.trial.IMediator;
import mediator.trial.People;

/**
 * @Description 核心：可以做任何事情
 * @ClassName MediumMediator
 * @Author wangDi
 * @date 2020-10-13 11:21
 */
public class MediumMediator implements IMediator {
    People buyer;
    People seller;


    @Override
    public void buy() {
        System.out.println("帮我问问卖家这个卖多少钱");
    }

    @Override
    public void sell() {
        System.out.println("告诉买家，五毛不还价");
    }


    @Override
    public void registerBuyer(People buyer) {
        this.buyer = buyer;
    }

    @Override
    public void registerSeller(People seller) {
        this.seller = seller;
    }
}
