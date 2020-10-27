package mediator.example.imp;

import mediator.example.Colleague;
import mediator.example.IMediator;

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
        System.out.println("mediator is fighting");
    }

    @Override
    public void talk() {
        System.out.println("mediator is talking");

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
