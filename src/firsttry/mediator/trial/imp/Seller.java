package firsttry.mediator.trial.imp;

import firsttry.mediator.trial.IMediator;
import firsttry.mediator.trial.People;

/**
 * @Description
 * @ClassName Seller
 * @Author wangDi
 * @date 2020-10-13 11:27
 */
public class Seller extends People {
    public Seller(IMediator mediator) {
        super(mediator);
//        firsttry.mediator.registerSeller(this);
    }

    @Override
    public void doSomeThing() {
        mediator.sell();
    }
}
