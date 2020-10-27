package mediator.trial.imp;

import mediator.trial.IMediator;
import mediator.trial.People;

/**
 * @Description
 * @ClassName Buyer
 * @Author wangDi
 * @date 2020-10-13 11:26
 */
public class Buyer extends People {
    public Buyer(IMediator mediator) {
        super(mediator);
//        mediator.registerBuyer(this);
    }

    @Override
    public void doSomeThing() {
        mediator.buy();
    }
}
