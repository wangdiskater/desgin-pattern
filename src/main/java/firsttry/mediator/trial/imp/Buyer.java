package firsttry.mediator.trial.imp;

import firsttry.mediator.trial.IMediator;
import firsttry.mediator.trial.People;

/**
 * @Description
 * @ClassName Buyer
 * @Author wangDi
 * @date 2020-10-13 11:26
 */
public class Buyer extends People {
    public Buyer(IMediator mediator) {
        super(mediator);
//        firsttry.mediator.registerBuyer(this);
    }

    @Override
    public void doSomeThing() {
        mediator.buy();
    }
}
