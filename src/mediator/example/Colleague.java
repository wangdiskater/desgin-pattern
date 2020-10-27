package mediator.example;

/**
 * @Description
 * @ClassName Colleague
 * @Author wangDi
 * @date 2020-10-13 10:39
 */
public abstract class Colleague {
    /**
     * 所有人都要通过这个玩意沟通
     */
    IMediator mediator;

    public Colleague() {
    }

    public Colleague(IMediator mediator) {
        this.mediator = mediator;
    }

    abstract void doSomeThing();
}
