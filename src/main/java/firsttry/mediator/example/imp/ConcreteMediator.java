package firsttry.mediator.example.imp;

import firsttry.mediator.example.Colleague;
import firsttry.mediator.example.IMediator;

/**
 * @Description
 * @ClassName ConcreteMediator
 * @Author wangDi
 * @date 2020-10-13 10:42
 */
public class ConcreteMediator implements IMediator {

    Colleague talk;
    Colleague fight;

    @Override
    public void fight() {
        System.out.println("firsttry.mediator is fighting");
    }

    @Override
    public void talk() {
        System.out.println("firsttry.mediator is talking");

    }

    @Override
    public void registerA(Colleague colleague) {
        talk = colleague;
    }

    @Override
    public void registerB(Colleague colleague) {
        fight = colleague;
    }
}
