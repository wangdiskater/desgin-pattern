package firsttry.mediator.example;

/**
 * @Description
 * @ClassName ColleagueA
 * @Author wangDi
 * @date 2020-10-13 10:39
 */
public class ColleagueA extends Colleague {

    public ColleagueA(IMediator mediator) {
        super(mediator);
        this.mediator.registerA(this);
    }

    @Override
    void doSomeThing() {
        this.mediator.talk();
    }
}
