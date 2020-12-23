package firsttry.mediator.trial;

/**
 * @Description
 * @ClassName People
 * @Author wangDi
 * @date 2020-10-13 11:23
 */
public abstract class People {

    public IMediator mediator;

    public People(IMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void doSomeThing();
}
