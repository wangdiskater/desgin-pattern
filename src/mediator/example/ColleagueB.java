package mediator.example;

import mediator.example.imp.ConcreteMediator;

/**
 * @Description
 * @ClassName ColleagueB
 * @Author wangDi
 * @date 2020-10-13 10:40
 */
public class ColleagueB extends Colleague {

    public ColleagueB(IMediator mediator) {
        super(mediator);
        this.mediator.registerB(this);
    }

    @Override
    void doSomeThing() {
        this.mediator.fight();
    }
}
